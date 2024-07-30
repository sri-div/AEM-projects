package com.adobe.aem.guides.demo.core.listeners;

import java.util.HashMap;
import java.util.Map;

import javax.jcr.LoginException;
import javax.jcr.RepositoryException;


import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.PersistenceException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.replication.ReplicationAction;
import com.day.cq.replication.ReplicationActionType;

@Component(service = EventHandler.class,immediate = true,
property={
    EventConstants.EVENT_TOPIC + "=" + ReplicationAction.EVENT_TOPIC
})
public class TaskPage implements EventHandler {
    private static final Logger log = LoggerFactory.getLogger(TaskPage.class);

    @Reference
    private ResourceResolverFactory resolverFactory;

    @Override
    public void handleEvent(Event event) {
        log.info("executed");
        
        try {
            handleReplicationEvent(event);
        } catch (RepositoryException | PersistenceException e) {
            log.error("Error handling replication event: ", e);
        } 
        
    }

    private void handleReplicationEvent(Event event) throws LoginException, PersistenceException, RepositoryException {
         log.info("Handling replication event.");

        ReplicationAction action = ReplicationAction.fromEvent(event);
        String path = action.getPath();
        ReplicationActionType type = action.getType();
        log.info("Replication action occurred: {} for path: {}", type.getName(), path);

        if (type == ReplicationActionType.ACTIVATE) {
        addProperty(path);
        }

    }
        private void addProperty(String path) throws LoginException, RepositoryException, PersistenceException {
        Map<String, Object> params = new HashMap<>();
        params.put(ResourceResolverFactory.SUBSERVICE, "divya");

            try (ResourceResolver resolver = resolverFactory.getServiceResourceResolver(params)) {
                String contentPath = path + "/jcr:content";
                Resource resource = resolver.getResource(contentPath);
                if (resource != null) {
                    ModifiableValueMap properties = resource.adaptTo(ModifiableValueMap.class);
                    if (properties != null) {
                        properties.put("changed", true);
                        resolver.commit();
                        log.info("changed-boolean-true' added to {}", contentPath);
                    } else {
                        log.warn("ModifiableValueMap is null for {}", contentPath);
                    }
                } else {
                    log.warn("Resource not found at path {}", contentPath);
                }
            } catch (Exception e) {
                log.error("Error while adding property to {}", path, e);
            }
        }
    }


        
   



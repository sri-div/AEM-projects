// package com.adobe.aem.guides.demo.core.listeners;

// import java.io.IOException;

// import javax.jcr.Node;

// import org.apache.http.client.methods.CloseableHttpResponse;
// import org.apache.http.client.methods.HttpGet;
// import org.apache.http.impl.client.CloseableHttpClient;
// import org.apache.http.impl.client.HttpClients;
// import org.apache.sling.api.resource.ModifiableValueMap;
// import org.apache.sling.api.resource.PersistenceException;
// import org.apache.sling.api.resource.Resource;
// import org.apache.sling.api.resource.ResourceResolver;
// import org.apache.sling.api.resource.ResourceResolverFactory;
// import org.osgi.service.component.annotations.Component;
// import org.osgi.service.component.annotations.Reference;
// import org.osgi.service.event.Event;
// import org.osgi.service.event.EventConstants;
// import org.osgi.service.event.EventHandler;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

// import com.day.cq.replication.ReplicationAction;
// import com.day.cq.replication.ReplicationActionType;


// @Component(service = EventHandler.class,immediate = true,
// property={
//     EventConstants.EVENT_TOPIC + "=" + ReplicationAction.EVENT_TOPIC

// })
// public class TaskHandler implements EventHandler{
//     private static Logger log= LoggerFactory.getLogger(TaskHandler.class);
  
//     @Reference
//     private ResourceResolverFactory resourceResolverFactory;


//     @Override
//     public void handleEvent(Event event){
//         log.info("executed");
//         log.info("Topic Name: {}", event.getTopic());

//        String[] propertyNames = event.getPropertyNames();
//        for (String name  : propertyNames) {
//         log.info("Property name: {}, Property value: {}", name, event.getProperty(name));

//         //triggerServlet(event);


//        }
       

//        // Handle replication event
//         if ("com/day/cq/replication".equals(event.getTopic())) {
//             ReplicationAction replicationAction = ReplicationAction.fromEvent(event);
//             if (replicationAction != null) {
//                 ReplicationActionType actionType = replicationAction.getType();
//                 String path = replicationAction.getPath();
//                 log.info("Replication action: {}, Path: {}", actionType, path);

//                 propertychanged(path);

//                 // Handle specific replication actions
//                 // if (ReplicationActionType.ACTIVATE.equals(actionType)) {
//                 //     log.info("Page activated: {}", path);

//                 // } else if (ReplicationActionType.DEACTIVATE.equals(actionType)) {
//                 //     log.info("Page deactivated: {}", path);
//                 // } else if (ReplicationActionType.DELETE.equals(actionType)) {
//                 //     log.info("Page deleted: {}", path);
//                 // }

//             }
//         }
//     }

//     //   private void triggerServlet(Event event) {
//     //     String servletUrl = "http://localhost:4502/bin/servlethandling"; // Replace with your servlet URL
//     //     try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
//     //         HttpGet request = new HttpGet(servletUrl);
//     //         try (CloseableHttpResponse response = httpClient.execute(request)) {
//     //             log.info("Servlet triggered with status: {}", response.getStatusLine().getStatusCode());
//     //             log.info("servlet triggered sucessfully");
//     //       }
//     //     } catch (IOException e) {
//     //         log.error("Error triggering servlet", e);

//     //     } 
//     // }

//     public void propertychanged(String path) throws PersistenceException {
//         try(ResourceResolver resourceResolver =resourceResolverFactory.getServiceResourceResolver()){
//              Resource Resource = resourceResolver.getResource(path + "/jcr:content");
//              if(Resource !=null){
//                 ModifiableValueMap divya = Resource.adaptTo(ModifiableValueMap.class);
//                 if(divya !=null){
//                     divya.put("CHANGED", true);
//                     resourceResolver.commit();
//                     log.info("executed");

//                 }
//              }
//         }

//     }
// }

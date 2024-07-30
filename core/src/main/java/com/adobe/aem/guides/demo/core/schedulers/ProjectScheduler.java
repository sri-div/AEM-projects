package com.adobe.aem.guides.demo.core.schedulers;

import org.apache.sling.commons.scheduler.ScheduleOptions;
import org.apache.sling.commons.scheduler.Scheduler;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.aem.guides.demo.core.osgiconfig.ProjectShedConfig;




@Component(service = Runnable.class, immediate = true)
@Designate(ocd = ProjectShedConfig.class)
public class ProjectScheduler implements Runnable{
    private static Logger log = LoggerFactory.getLogger(ProjectScheduler.class);

    @Reference
    private Scheduler schedulers;
    private String CRONExpression;

    @Activate
    private void Activate(ProjectShedConfig config){
        this.CRONExpression = config.Expression();
        scheduleJob();
        
    } 
    private void scheduleJob() {
        ScheduleOptions scheduleOptions = schedulers.EXPR(CRONExpression);
        scheduleOptions.name("customaised job");
        scheduleOptions.canRunConcurrently(false);       
        try {
            schedulers.schedule(this, scheduleOptions);
            log.info("Scheduler job added with cron expression: {}", CRONExpression);
        } catch (Exception e) {
            log.error("Error while scheduling the job", e);
        }
    }
    @Override
    public void run() {
        // Implement the logic to be executed periodically
        log.info("Custom Scheduler Job executed.");
    }

}

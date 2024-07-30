package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service =Hari.class,immediate = true,name = "Hari" )
public class Hari {
    private static Logger log=LoggerFactory.getLogger(Hari.class);
    @Activate
    public void activated(){
      log.info("logger is activated");
    }
    public void deactivated(){
        log.info("logger is deactivated");
    }

}

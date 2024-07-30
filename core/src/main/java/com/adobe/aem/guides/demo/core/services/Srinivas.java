package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component(service = Srinivas.class,immediate = true, name = "Srinivas")
public class Srinivas {
    public static Logger log=LoggerFactory.getLogger(Srinivas.class);

    @Activate
    public void activate(){
        log.info("divya");

    }
   
    @Deactivate
    public void Deactivate(){
        log.info("sri");
    }
    

}

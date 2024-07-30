package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = Proj.class,immediate = true, name = "Proj")
public class Proj {
    public static Logger log= LoggerFactory.getLogger(Proj.class);

    @Activate
    public void Activate(){
        log.info("Proj is activated");
    }
    @Deactivate
    public void Deactivate(){
        log.info("Proj is deactivated");
    }

}

package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = Chitti.class,immediate = true,name = "Chitti")
public class Chitti {
    public static Logger log=LoggerFactory.getLogger(Chitti.class);

    @Activate
    public void activate(){
        log.info("dfghbj");

    }
    @Deactivate
    public void deactivated(){
        log.info("cfgvhb");
    }

}

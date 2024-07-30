package com.adobe.aem.guides.demo.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Multichitti{

    @Inject
    public String fullname;
    @Inject
    public String fathername;


    public String getFathername() {
        return fathername;
    }


    @ChildResource
    public List<Chittichild> kuchi;
    
    public List<Chittichild> getKuchi() {
        return kuchi;
    }
    
    public String getFullname() {
        return fullname;
    }


}

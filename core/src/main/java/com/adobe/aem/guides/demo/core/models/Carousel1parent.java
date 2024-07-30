package com.adobe.aem.guides.demo.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Carousel1parent {

    @Inject
    public String fathername;

    @Inject
    public String mothername;

    @Inject
    public String address;

    @ChildResource
    private List<Carousel1child>bubbly;



    public String getFathername() {
        return fathername;
    }

    public String getMothername() {
        return mothername;
    }

    public String getAddress() {
        return address;
    }

    public List<Carousel1child> getBubbly() {
        return bubbly;
    }




}

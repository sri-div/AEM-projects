package com.adobe.aem.guides.demo.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Exparent {
    @Inject
    public String fullname;
    @Inject
    public String image;
    @Inject
    public String date;

    @ChildResource
    public List<Exmulti>see;

    public String getFullname() {
        return fullname;
    }

    public String getImage() {
        return image;
    }

    public String getDate() {
        return date;
    }

    public List<Exmulti> getSee() {
        return see;
    }




}

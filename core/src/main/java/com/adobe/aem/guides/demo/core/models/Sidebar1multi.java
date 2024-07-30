package com.adobe.aem.guides.demo.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Sidebar1multi {

    @Inject
    public String fathername;
    @Inject
    public String image;
    @Inject
    public String desktop;

    @ChildResource
    private List<Sidebarnested>url;

    public String getFathername() {
        return fathername;
    }

    public String getImage() {
        return image;
    }

    public String getDesktop() {
        return desktop;
    }

    public List<Sidebarnested> getUrl() {
        return url;
    }




}

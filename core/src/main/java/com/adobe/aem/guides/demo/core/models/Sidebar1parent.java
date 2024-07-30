package com.adobe.aem.guides.demo.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Sidebar1parent {

    @Inject
    public String logopath;
    @Inject
    public String logoimage;
    @Inject
    public String select;

    @ChildResource
    private List<Sidebar1multi>head;

    @ChildResource
    private List<Sidebar1multi>sidebar;

    public String getLogopath() {
        return logopath;
    }

    public String getLogoimage() {
        return logoimage;
    }

    public String getSelect() {
        return select;
    }

    public List<Sidebar1multi> getHead() {
        return head;
    }

    public List<Sidebar1multi> getSidebar() {
        return sidebar;
    }



   

}

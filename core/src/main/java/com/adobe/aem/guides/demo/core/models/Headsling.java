package com.adobe.aem.guides.demo.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Headsling {
    @Inject
    public String sri;
    @Inject
    public String kuchipudi;
    @Inject
    public String checkbox;

    @ChildResource
    private List<Child>details;

    public String getSri() {
        return sri;
    }

    public String getKuchipudi() {
        return kuchipudi;
    }

    public String getCheckbox() {
        return checkbox;
    }

    public List<Child> getDetails() {
        return details;
    }


}

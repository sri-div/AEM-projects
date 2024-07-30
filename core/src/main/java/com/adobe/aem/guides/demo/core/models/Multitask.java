package com.adobe.aem.guides.demo.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Multitask {

    @Inject
    private String fathername;
    @Inject
    private String mothername;

    @Inject
    private String Dob;
    @Inject
    private String checkbox;

    @ChildResource
    private List<Nestedmulti>nested;

    public String getFathername() {
        return fathername;
    }

    public String getMothername() {
        return mothername;
    }

    public String getDob() {
        return Dob;
    }

    public String getCheckbox() {
        return checkbox;
    }

    public List<Nestedmulti> getNested() {
        return nested;
    }

    

}

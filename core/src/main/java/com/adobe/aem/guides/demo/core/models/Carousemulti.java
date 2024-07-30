package com.adobe.aem.guides.demo.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Carousemulti {

    @Inject
    public String fullname;

    @Inject
    public String checkbox;

    @ChildResource
    private List<Carousenested>nestedmulti;

    public String getFullname() {
        return fullname;
    }

    public String getCheckbox() {
        return checkbox;
    }

    public List<Carousenested> getNestedmulti() {
        return nestedmulti;
    }



   

}

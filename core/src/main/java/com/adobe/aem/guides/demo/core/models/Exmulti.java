package com.adobe.aem.guides.demo.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Exmulti {
    @Inject
    public String skills;
    @Inject
    public String salary;

    public String getSkills() {
        return skills;
    }
    public String getSalary() { 
        return salary;
    }

}

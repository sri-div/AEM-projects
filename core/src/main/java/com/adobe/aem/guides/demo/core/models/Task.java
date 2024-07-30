package com.adobe.aem.guides.demo.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Task {

    @Inject
    private String firstname;
    @Inject
    private String lastname;
    @Inject
    private String gender;

    @Inject
    private String region;
    @Inject
    private String text;

    @ChildResource
    private List<Multitask>family;
    @ChildResource
    private List<Multitask>details;
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getGender() {
        return gender;
    }
    public String getRegion() {
        return region;
    }
    public String getText() {
        return text;
    }
    public List<Multitask> getFamily() {
        return family;
    }
    public List<Multitask> getDetails() {
        return details;
    }
}

package com.adobe.aem.guides.demo.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Carousel1child {

    @Inject
    public String devi;

    @Inject
    public String company;

    @Inject
    public String ctc;

    public String getDevi() {
        return devi;
    }

    public String getCompany() {
        return company;
    }

    public String getCtc() {
        return ctc;
    }




}

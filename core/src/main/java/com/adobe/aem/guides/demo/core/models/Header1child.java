package com.adobe.aem.guides.demo.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Header1child {

    @Inject
    public String text;

    @Inject
    public String datepicker;

    @Inject
    public String checkbox;

    public String getText() {
        return text;
    }

    public String getDatepicker() {
        return datepicker;
    }

    public String getCheckbox() {
        return checkbox;
    }



}

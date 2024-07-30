package com.adobe.aem.guides.demo.core.models;

import java.util.List;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Header1parent {

    @Inject
    public String pathfield;
    @Inject
    public String textfield;

    @ChildResource
    private List<Header1child>multifield;

    public String getPathfield() {
        return pathfield;
    }

    public String getTextfield() {
        return textfield;
    }

    public List<Header1child> getMultifield() {
        return multifield;
    }



}

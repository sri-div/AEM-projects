package com.adobe.aem.guides.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class Project {

    @ValueMapValue
    private String food;

    @ValueMapValue
    private String dress;

    public String getFood() {
        return food;
    }

    public String getDress() {
        return dress;
    }






    
}

package com.adobe.aem.guides.demo.core.osgiconfig;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "ProjectShedConfig", description = " scheduler")
public @interface ProjectShedConfig {

    @AttributeDefinition(
        name = "CRON Expression",
        type = AttributeType.STRING,
        description = "Enter"


    )
    String Expression() default "0 0/5 * 1/1 * ? *";

}

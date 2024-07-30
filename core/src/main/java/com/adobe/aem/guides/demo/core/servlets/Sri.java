package com.adobe.aem.guides.demo.core.servlets;

import java.io.IOException;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;

@Component(service = Servlet.class,immediate = true, 
property={
    //"sling.servlet.paths=/bin/sd"    by using path in old version of osgi ds 1.2 r5


    //by using resourcetype in old version of osgi ds 1.2(r5)
    "sling.servlet.resourceTypes=Demo/components/helloworld",
    "sling.servlet.selectors=two",
    "sling.servlet.extension=recent" 
})
public class Sri extends SlingAllMethodsServlet{


    
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        JsonObjectBuilder  divya =Json.createObjectBuilder();
        divya.add("98765","87");
        divya.add("name","details");
        divya.add("chitti","3");
        response.getWriter().write(divya.build().toString());

        

        
    }

}

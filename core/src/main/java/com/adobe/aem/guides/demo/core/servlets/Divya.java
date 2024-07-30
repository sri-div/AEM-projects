package com.adobe.aem.guides.demo.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;


import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;

@Component(service = Servlet.class,immediate = true,
property={

    "Sling.servlet.paths=/bin/see"

}
)
public class Divya extends SlingAllMethodsServlet {
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
               String show="/content/Demo/us/en/jcr:content/root/container/container/task_310571684";
             ResourceResolver sri = request.getResourceResolver(); 
             Resource diya =sri.getResource(show);
             ValueMap Kuchi =diya.getValueMap();
             String fathername =Kuchi.get("fathername",String.class);  
           response.getWriter().write("fathername"+ fathername);    
    

            }
}

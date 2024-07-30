package com.adobe.aem.guides.demo.core.servlets;

import java.io.IOException;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;

@Component(service = Servlet.class,immediate = true)
 @SlingServletResourceTypes(

 //by using resourcetype in new version of osgi ds 1.4(r5)

    resourceTypes={"Demo/components/page","foundation/components/redirect"},
    selectors = {"you","me"},
    extensions = {"txt","json"}

    )
//@SlingServletPath("/bin/shgf")       by using path in new version of osgi ds 1.4(r5)
public class Kuchipudi extends SlingAllMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("application/json");
                JsonObjectBuilder srinu =Json.createObjectBuilder();
                srinu.add("sdf","34");
                srinu.add("rtyu","3456");
                response.getWriter().write(srinu.build().toString());
                
        
    }

}

package com.adobe.aem.guides.demo.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;



@Component(service = Servlet.class, immediate = true,
property={
    "sling.servlet.paths=/bin/servlethandling"
     
})
public class HandlerTask extends SlingAllMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("application/json");
                response.getWriter().write("triggered successfully");
                


        
    }

}

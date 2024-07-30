package com.adobe.aem.guides.demo.core.servlets;

import java.io.IOException;


import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;

@Component(service = Servlet.class,immediate = true,
property={
    "sling.servlet.paths=/bin/day2"


})
public class Task extends SlingAllMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
                
                //random letter
            String sessionpar= request.getParameter("session");

            String cvb = request.getParameter("random");

            if("session".equals(sessionpar)){
                String chitti = RandomStringUtils.randomAlphabetic(6);
                
                response.setContentType("text/plain");
                response.getWriter().write(chitti.toUpperCase());

            }
            else{
                response.setStatus(SlingHttpServletResponse.SC_BAD_REQUEST);
                response.getWriter().write("error");

            }


                
        
    }

  

}

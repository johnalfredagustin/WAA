/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.midterms.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Web application lifecycle listener.
 *
 * @author John Agustin
 */
public class ServletListener implements ServletContextListener, HttpSessionAttributeListener {

    private ServletContextEvent psce;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        psce = sce;
        psce.getServletContext().setAttribute("sessionCounter", 0);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        Integer oldCount = (Integer) psce.getServletContext().getAttribute("sessionCounter");
        if (event.getName().equals("Auth")) {
            oldCount++;
        }
        psce.getServletContext().setAttribute("sessionCounter", oldCount);
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        Integer oldCount = (Integer) psce.getServletContext().getAttribute("sessionCounter");
        if (event.getName().equals("Auth")) {
            oldCount--;
        }
        psce.getServletContext().setAttribute("sessionCounter", oldCount);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

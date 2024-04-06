package com.vtn;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import lombok.extern.java.Log;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.util.logging.Level;

@WebListener
@Log
public class Web implements ServletContextListener {

    private WebApplicationContext applicationContext;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.log(Level.INFO, "I'm inside context initialized");
        applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(sce.getServletContext());
    }
}

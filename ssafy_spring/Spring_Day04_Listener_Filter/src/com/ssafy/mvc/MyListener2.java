package com.ssafy.mvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

public class MyListener2 implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("웹어플리케이션이 종료가 될때 호출 될 친구2");
    }
    
    
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("웹어플리케이션이 시작될때 호출 될 친구2");
    	
    	ServletContext context = sce.getServletContext();
    	System.out.println(context.getInitParameter("welcome"));
    }
	
}

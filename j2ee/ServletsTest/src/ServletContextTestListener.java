

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class ServletContextTestListener
 *
 */
public class ServletContextTestListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ServletContextTestListener() {
        // TODO Auto-generated constructor stub
    }

    public void contextDestroyed(ServletContextEvent arg0) {
    	System.out.println("CONTEXT DESTROYED");
    }
    
    public void contextInitialized(ServletContextEvent arg0) {
    	System.out.println("CONTEXT CREATED ");
    }
    
}

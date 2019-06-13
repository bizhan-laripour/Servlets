package event_and_listeners.servlet_context_event;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class LoginContextListener implements ServletContextListener {


    public void contextInitialized(ServletContextEvent sce) {

        sce.getServletContext().setAttribute("name" , "bizhan");
        sce.getServletContext().setAttribute("lastName" , "laripour");
    }

    public void contextDestroyed(ServletContextEvent sce) {
    }
}

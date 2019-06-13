package event_and_listeners.httpSession_event;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class HSessionListener implements HttpSessionListener {

    private Integer total=0;

    private Integer now=0;



    public  void sessionCreated(HttpSessionEvent se) {

        this.total++;
        this.now++;
        ServletContext context = se.getSession().getServletContext();
        context.setAttribute("total" , total);
        context.setAttribute("now" , now);

    }

    public void sessionDestroyed(HttpSessionEvent se) {
        this.now--;
        ServletContext context = se.getSession().getServletContext();
        context.setAttribute("now" , now);

    }
}

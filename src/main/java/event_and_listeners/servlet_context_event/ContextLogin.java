package event_and_listeners.servlet_context_event;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ContextLogin extends HttpServlet {

    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");
        PrintWriter printWriter = httpServletResponse.getWriter();
        ServletContext context = getServletContext();
        String name = (String) context.getAttribute("name");
        String lastName = (String) context.getAttribute("lastName");

        printWriter.println("hello "+name+ " "+lastName);
        printWriter.close();
    }

    public void doGet(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {
        doPost(httpServletRequest , httpServletResponse);
    }
}

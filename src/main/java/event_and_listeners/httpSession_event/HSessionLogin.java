package event_and_listeners.httpSession_event;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HSessionLogin extends HttpServlet {

    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");
        PrintWriter printWriter = httpServletResponse.getWriter();

       ServletContext context =  httpServletRequest.getServletContext();
       Integer total = (Integer) context.getAttribute("total");
       Integer now = (Integer) context.getAttribute("now");

        printWriter.println("<html><body>");
        printWriter.println("<form method=\"POST\" action=\"hLoginCont\" >");
        printWriter.println("insert your name an d get a session <input type=\"text\" name=\"name\"/><br/>");
        printWriter.println("<input type=\"submit\" value=\"getSession\" /><br/>");
        printWriter.println("</form>");

        printWriter.println("<form method=\"POST\" action=\"hLogout\" >");
        printWriter.println("<input type=\"submit\" value=\"logout\" /><br/>");
        printWriter.println("</form>");
        printWriter.println("the total is :" +total+"<br/>");
        printWriter.println("now is :"+now);
        printWriter.println("</body></html>");
        printWriter.close();
    }

    public void doGet(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {
        doPost(httpServletRequest , httpServletResponse);
    }
}

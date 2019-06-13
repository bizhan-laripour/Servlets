package session_tracking.session;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionHome extends HttpServlet {

    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");
        PrintWriter printWriter = httpServletResponse.getWriter();

        printWriter.println("<html><body>");
        printWriter.println("<form method=\"POST\" action=\"sessionLogout\" />");
        printWriter.println("if you want to logout click on the button <input type=\"submit\" value=\"logout\"/><br/>");
        printWriter.println("<form/></body></html>");
    }
}

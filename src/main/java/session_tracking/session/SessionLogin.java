package session_tracking.session;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionLogin extends HttpServlet {


    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {

        httpServletResponse.setContentType("text/html");
        PrintWriter printWriter = httpServletResponse.getWriter();
        printWriter.println("<html><body>");
        printWriter.println("<form method=\"POST\" action=\"loginController\"/>");
        printWriter.println("insert your name : <input type=\"text\" name=\"username\"/><br/>");
        printWriter.println("insert your password : <input type=\"text\" name=\"password\"/><br/>");
        printWriter.println("insert your name : <input type=\"submit\" value=\"login\"/><br/>");
        printWriter.println("</form>");

        printWriter.println("<form method=\"POST\" action=\"sessionGo\" />");
        printWriter.println("<input type=\"submit\" value=\"go\"/><br/>");
        printWriter.println("</form></body></html>");
        printWriter.close();
    }

    public void doGet(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {
        doPost(httpServletRequest , httpServletResponse);
    }
}

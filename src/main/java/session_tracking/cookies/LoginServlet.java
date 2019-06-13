package session_tracking.cookies;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");
        PrintWriter printWriter = httpServletResponse.getWriter();

        printWriter.println("<html><head><title>cookie</title></head>");
        printWriter.println("<body>");
        printWriter.println("<form method=\"POST\" action=\"controller2\" >");
        printWriter.println(" insert username :<input type=\"text\" name=\"username\" /><br/>");
        printWriter.println("insert password : <input type=\"text\" name=\"password\" /><br/>");
        printWriter.println("insert password : <input type=\"submit\" value=\"login\" /><br/>");
        printWriter.println("</form><br/>");


        printWriter.println("<form method=\"POST\" action=\"go\" >");
        printWriter.println("insert password : <input type=\"submit\" value=\"go\" /><br/>");
        printWriter.println("</form>");


        printWriter.println("</body></html>");
        printWriter.close();

    }

    public void doGet(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {
        doPost(httpServletRequest , httpServletResponse);
    }
}

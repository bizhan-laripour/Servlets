package session_tracking.cookies;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeServlet extends HttpServlet {

    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");
        PrintWriter printWriter = httpServletResponse.getWriter();
        printWriter.println("<html><body>");
        printWriter.println("<form method=\"POST\" action=\"logout\" >");
        printWriter.println("insert password : <input type=\"submit\" value=\"logout\" /><br/>");
        printWriter.println("</form>");
        printWriter.println("</body></html>");
        printWriter.close();
    }
}

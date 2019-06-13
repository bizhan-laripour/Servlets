package filters;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BaseLogin extends HttpServlet {


    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");
        PrintWriter printWriter = httpServletResponse.getWriter();

        printWriter.println("<html><body>");
        printWriter.println("<form method=\"POST\" action=\"baseLogin\" >");
        printWriter.println("insert your username : <input type=\"text\" name=\"username\"/>");
        printWriter.println("insert your password : <input type=\"text\" name=\"password\"/>");
        printWriter.println("<input type=\"submit\" value=\"login\"/>");
        printWriter.println("</form></body></html>");
        printWriter.close();
    }

    public void doGet(HttpServletRequest httpServletRequest ,HttpServletResponse httpServletResponse) throws IOException {
        doPost(httpServletRequest , httpServletResponse);
    }
}

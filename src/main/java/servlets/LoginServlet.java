package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {


    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {

        httpServletResponse.setContentType("text/html");
        PrintWriter printWriter = httpServletResponse.getWriter();
        printWriter.println("<html><head>");
        printWriter.println("<title>this is first dispatcher</title>");
        printWriter.println("</head><body>");
        printWriter.println("<form method=\"POST\" action=\"controller\" >");
        printWriter.println("insert your name : <input type=\"text\" name=\"name\" />");
        printWriter.println("insert your lastName : <input type=\"text\" name=\"lastName\" />");
        printWriter.println("<input type=\"submit\" value=\"login\"/>");
        printWriter.println("</form></body></html>");
        printWriter.close();

    }

    public void doGet(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {
        doPost(httpServletRequest , httpServletResponse);
    }
}

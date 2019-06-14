package crud.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CrudLogin extends HttpServlet {

    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");
        PrintWriter printWriter = httpServletResponse.getWriter();

        printWriter.println("<html><head><title>index</title><head>");
        printWriter.println("<body>");
        printWriter.println("<form method=\"POST\" action=\"crudLoginCont\">");
        printWriter.println("username : <input type=\text\" name=\"username\"/><br/>");
        printWriter.println("password : <input type=\text\" name=\"password\"/><br/>");
        printWriter.println("<input type=\"submit\" value=\"login\"/><br/>");
        printWriter.println("</form><br/>");


        printWriter.println("<form method=\"POST\" action=\"register\">");
        printWriter.println("<input type=\"submit\" value=\"i am new \"/><br/>");
        printWriter.println("</form>");
        printWriter.println("</body></html>");

    }

    public void doGet(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {
        doPost(httpServletRequest , httpServletResponse);
    }
}

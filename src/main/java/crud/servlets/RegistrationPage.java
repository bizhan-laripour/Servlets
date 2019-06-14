package crud.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegistrationPage extends HttpServlet {

    public void  doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {

        httpServletResponse.setContentType("text/html");
        PrintWriter printWriter = httpServletResponse.getWriter();
        printWriter.println("<html><head><title>registration</title><head>");
        printWriter.println("<body>");
        printWriter.println("<form method=\"POST\" action=\"saveServlet\">");
        printWriter.println("name : <input type=\text\" name=\"name\"/><br/>");
        printWriter.println("lastName : <input type=\text\" name=\"lastName\"/><br/>");
        printWriter.println("username : <input type=\text\" name=\"username\"/><br/>");
        printWriter.println("password : <input type=\text\" name=\"password\"/><br/>");
        printWriter.println("<input type=\"submit\" value=\"save\"/><br/>");
        printWriter.println("</form><br/>");
    }
}

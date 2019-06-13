package servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeServlet extends HttpServlet {

    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");
        PrintWriter printWriter = httpServletResponse.getWriter();
        ServletContext servletContext = getServletConfig().getServletContext();
        String name = servletContext.getInitParameter("name");
        servletContext.removeAttribute("lastName");
        String lastName = servletContext.getInitParameter("lastName");


        printWriter.println("this is you "+name + " "+lastName);
    }
}

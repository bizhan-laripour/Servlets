package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ControlleServlet extends HttpServlet {

    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException, ServletException {

        httpServletResponse.setContentType("text/html");
        PrintWriter printWriter = httpServletResponse.getWriter();

        String name = httpServletRequest.getParameter("name");
        String lastName = httpServletRequest.getParameter("lastName");

        ServletContext context = getServletContext();
//        context.setAttribute("name" , name);
//        context.setAttribute("lastName" , lastName);

        if(name.equals("bizhan") && lastName.equals("laripour")){
            RequestDispatcher requestDispatcher  = httpServletRequest.getRequestDispatcher("home");
            requestDispatcher.forward(httpServletRequest , httpServletResponse);
        }else{
            printWriter.println("you are not valid to use this service");
            RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("index");
            requestDispatcher.include(httpServletRequest , httpServletResponse);
        }

        printWriter.close();
    }
}

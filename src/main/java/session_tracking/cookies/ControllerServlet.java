package session_tracking.cookies;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ControllerServlet extends HttpServlet {

    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException, ServletException {

        httpServletResponse.setContentType("text/html");
        PrintWriter printWriter = httpServletResponse.getWriter();

        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");

        if(username.equals("bizhan") && password.equals("laripour")){
            Cookie cookie = new Cookie("cookie" , "cookie");
            httpServletResponse.addCookie(cookie);
            RequestDispatcher dispatcher = httpServletRequest.getRequestDispatcher("home2");
            dispatcher.forward(httpServletRequest, httpServletResponse);
        }
        else{
            printWriter.println("the username or password is incorrect");
            RequestDispatcher dispatcher = httpServletRequest.getRequestDispatcher("index2");
            dispatcher.include(httpServletRequest, httpServletResponse);
        }
    }
}

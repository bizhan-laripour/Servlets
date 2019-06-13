package session_tracking.cookies;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LogOut extends HttpServlet {

    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException, ServletException {

        httpServletResponse.setContentType("text/html");


        Cookie cookie = new Cookie("cookie" , "");
        cookie.setMaxAge(0);
        httpServletResponse.addCookie(cookie);
        RequestDispatcher dispatcher = httpServletRequest.getRequestDispatcher("index2");
        dispatcher.forward(httpServletRequest , httpServletResponse);
    }
}

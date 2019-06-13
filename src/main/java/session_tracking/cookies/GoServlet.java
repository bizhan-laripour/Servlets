package session_tracking.cookies;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GoServlet extends HttpServlet {

    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException, ServletException {

        httpServletResponse.setContentType("text/html");
        PrintWriter printWriter = httpServletResponse.getWriter();

        Cookie cookie[] = httpServletRequest.getCookies();
        if(cookie == null || cookie[0].getValue().equals("")){
            printWriter.println("you are not valid");
            RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("index2");
            requestDispatcher.include(httpServletRequest , httpServletResponse);
            printWriter.close();
        }else{
            RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("home2");
            requestDispatcher.forward(httpServletRequest , httpServletResponse);
        }
    }
}

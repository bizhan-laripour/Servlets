package session_tracking.session;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginController extends HttpServlet {

    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException, ServletException {
        httpServletResponse.setContentType("text/html");
        PrintWriter printWriter = httpServletResponse.getWriter();
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");

        if(username.equals("bizhan") && password.equals("laripour")){
            HttpSession httpSession = httpServletRequest.getSession();
            httpSession.setAttribute("user" , "ok");
            RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("sessionHome");
            requestDispatcher.forward(httpServletRequest , httpServletResponse);
        }else{
            printWriter.println("your username and password is incorrect");
            RequestDispatcher dispatcher = httpServletRequest.getRequestDispatcher("sessionIndex");
            dispatcher.include(httpServletRequest , httpServletResponse);
            printWriter.close();
        }
    }
}

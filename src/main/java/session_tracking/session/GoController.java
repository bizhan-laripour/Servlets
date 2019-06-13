package session_tracking.session;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class GoController extends HttpServlet {

    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException, ServletException {

        PrintWriter printWriter = httpServletResponse.getWriter();

        httpServletResponse.setContentType("text/html");

        HttpSession httpSession = httpServletRequest.getSession();

        if(httpSession.getAttribute("user").equals("ok")){
            RequestDispatcher dispatcher = httpServletRequest.getRequestDispatcher("sessionHome");
            dispatcher.forward(httpServletRequest , httpServletResponse);
        }else {
            printWriter.println("you didnt login login first");
            RequestDispatcher dispatcher = httpServletRequest.getRequestDispatcher("sessionIndex");
            dispatcher.include(httpServletRequest , httpServletResponse);
            printWriter.close();
        }
    }
}

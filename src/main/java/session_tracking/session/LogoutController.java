package session_tracking.session;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LogoutController extends HttpServlet {

    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException, ServletException {
        httpServletResponse.setContentType("text/html");
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("user" , "");
        RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("sessionIndex");
        requestDispatcher.forward(httpServletRequest , httpServletResponse);

    }
}

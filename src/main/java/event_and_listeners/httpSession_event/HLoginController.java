package event_and_listeners.httpSession_event;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class HLoginController extends HttpServlet {

    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws ServletException, IOException {
        HttpSession session = httpServletRequest.getSession();
        String name = httpServletRequest.getParameter("name");
        session.setAttribute(name , name);
        RequestDispatcher dispatcher = httpServletRequest.getRequestDispatcher("hLogin");
        dispatcher.include(httpServletRequest , httpServletResponse);
    }
}

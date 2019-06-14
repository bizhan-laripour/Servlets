package crud.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/testing")
public class TestServlet extends HttpServlet {


    public void doGet(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");

        PrintWriter printWriter = httpServletResponse.getWriter();

        printWriter.println("hello annotation");
        printWriter.close();
    }
}

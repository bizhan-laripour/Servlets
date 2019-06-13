package filters;

import javax.servlet.*;
import java.io.IOException;

public class FilterLogin implements Filter {


    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");

        if(username.equals("bizhan") && password.equals("laripour")){
            filterChain.doFilter(servletRequest , servletResponse);
        }else{
            RequestDispatcher dispatcher = servletRequest.getRequestDispatcher("filterClient");
            dispatcher.forward(servletRequest , servletResponse);
        }
    }

    public void destroy() {

    }
}

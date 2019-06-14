package crud.servlets;

import crud.dao.MemberService;
import crud.entity.Member;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveServlet extends HttpServlet {


    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws ServletException, IOException {

        MemberService memberService = new MemberService();
        Member member = new Member();

        String name = httpServletRequest.getParameter("name");
        String lastName = httpServletRequest.getParameter("lastName");
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");

        member.setName(name);
        member.setLastName(lastName);
        member.setUsername(username);
        member.setPassword(password);

        memberService.save(member);
        PrintWriter printWriter = httpServletResponse.getWriter();
        httpServletResponse.setContentType("text/html");
        printWriter.println("you logged in successfully");
        RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("crudIndex");
        requestDispatcher.include(httpServletRequest , httpServletResponse);

    }
}

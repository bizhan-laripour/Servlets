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
import java.util.ArrayList;
import java.util.List;

public class CrudLoginController  extends HttpServlet {


    public void doPost(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws IOException, ServletException {

        PrintWriter printWriter = httpServletResponse.getWriter();
        httpServletResponse.setContentType("text/html");

        MemberService memberService = new MemberService();
        List<Member> members = memberService.findAll();

        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");

        List<Member> list = new ArrayList<Member>();

        if(members.size() != 0) {
            for (Member member : members) {
                if (username.equals(member.getUsername()) && password.equals(member.getPassword())) {
                    list.add(member);

                }
            }
            if(list.size() == 0){
                printWriter.println("please login first");
                RequestDispatcher dispatcher = httpServletRequest.getRequestDispatcher("crudIndex");
                dispatcher.include(httpServletRequest, httpServletResponse);
            }
        }else{
            printWriter.println("please login first");
            RequestDispatcher dispatcher = httpServletRequest.getRequestDispatcher("crudIndex");
            dispatcher.include(httpServletRequest, httpServletResponse);
        }

        for(Member member : list){
            printWriter.println("<html><head><title>wllcomePage</title></head>");
            printWriter.println("<body>");
            printWriter.println("hello "+member.getName()+" "+member.getLastName()+" this is wellcome page<br/>");
            printWriter.println("and your username is "+member.getUsername()+" and your password is "+member.getPassword()+"<br/>");
            printWriter.println("<hr/>");
        }
        printWriter.println("</body></html>");
        printWriter.close();


    }
}

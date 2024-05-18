import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import user.UserImpl;
import user.dao;

@WebServlet("/LoginServlet")
public class login extends HttpServlet {

    private static UserImpl  userdao= new UserImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username= req.getParameter("username");
        String pass=req.getParameter("password");

        if(userdao.isValidUser(username,pass))
        {
            HttpSession session=req.getSession();
            session.setAttribute("username", username);
            resp.sendRedirect("welcome.jsp");

        }
        else 
        {
            resp.sendRedirect("login.jsp?error=1");
            System.out.println("error aa gya hai");
        }




        // if(username.equals("ranjeet"))
        // {
        //     resp.sendRedirect("welcome.jsp");
        // }
        


    }
    
    
}

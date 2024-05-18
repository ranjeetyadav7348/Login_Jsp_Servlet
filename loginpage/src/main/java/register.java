import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.UserImpl;
import user.dao;
import user.user;


@WebServlet("/RegisterServlet")
public class register extends HttpServlet {

    user User=new user();

    UserImpl userDao=new UserImpl() ;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        String username=req.getParameter("username");
        String email=req.getParameter("email");
        String pass=req.getParameter("password");


        User.setUsername(username);
        User.setPassword(pass);
        User.setEmail(email);


        if(userDao.addUser(User))
        {
            resp.sendRedirect("login.jsp?Registration=success");
        }
        else
        {
            resp.sendRedirect("login.jsp?error=1");
        }



       
    }
    
    
}

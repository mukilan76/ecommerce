package ecom.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ecom.connection.dbconnect;
import ecom.dao.userdao;
import ecom.model.user;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
        super();
       
    }

	
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		try {
			PrintWriter out = response.getWriter();
			userdao udao = new userdao(dbconnect.getconnection());
			user use = udao.userlogin(email, password);
			
			if(use != null) {
				response.sendRedirect("index.jsp");
				request.getSession().setAttribute("auth", use);
				
				
			}
			else response.sendRedirect("login.jsp");
			
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}}


package com.simplilearn.project;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


import com.simplilearn.JDBCUtil.JdbcUtil;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/flyaway")
public class flyaway extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public flyaway() {
        super(); 
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		Connection con=null;
		String username=(String) request.getParameter("username");
		String password=(String) request.getParameter("password");
		
			
		try {
			con=JdbcUtil.getMySqlConnection();
			 PreparedStatement ps = con.prepareStatement("select username,password from adminlogin where username=? and password=?");
			 ps.setString(1, username);
	         ps.setString(2, password);
	         ResultSet rs = ps.executeQuery();
	         System.out.println(username);
	         System.out.println(password);
	         while (rs.next()) {
	        	 response.sendRedirect("AdminPage.jsp");
	                return;
	            }
	         PrintWriter out = response.getWriter();
	 		out.print("<html><body>");
	 		out.print("<h3>Please provide valid username and password<h3>");
	 		out.print("</html></body>");
	 		
		
			}
		catch (Exception e) {
            e.printStackTrace();

			}
		
	}

}

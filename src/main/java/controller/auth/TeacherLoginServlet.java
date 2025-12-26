package controller.auth;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class TeacherLoginServlet
 */
@WebServlet("/TeacherLogin")
public class TeacherLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
//		request.getRequestDispatcher("teacher/teacher-dashboard.jsp").forward(request, response);
		
		response.sendRedirect("teacher/teacher-dashboard.jsp");
	}

}

package controller.auth;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.AdminDao;
import dao.impl.AdminDaoImpl;

/**
 * Servlet implementation class AdminSignupServlet
 */
@WebServlet("/AdminSignupServlet")
public class AdminSignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminDao adminDao = new AdminDaoImpl();

		// Check if admin already exists
//		if (adminDao.adminExists()) {
//			// Admin already created → block signup
//			request.getRequestDispatcher("admin/admin-exists.jsp").forward(request, response);
//
//		} else {
//
//			// First-time setup → allow signup page
//			request.getRequestDispatcher("/WEB-INF/admin/signup.jsp").forward(request, response);
//		}
		
		request.getRequestDispatcher("/WEB-INF/admin/signup.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package servletProject;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/userinfo")
public class UserInfo extends HttpServlet {
	
	public UserInfo(){}
	
	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException,IOException {
		
		HttpSession session = request.getSession();		
		User user = (User) session.getAttribute("USER");
		if(user == null) {
			response.sendRedirect(this.getServletContext().getContextPath()
			+ "/session");
			return;
		}
		
		
		ServletOutputStream out = response.getOutputStream();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Informations utilisateur</h1>");
		out.println("<p>UID : "+ user.getUID() + "</p>");
		out.println("<p>Username : "+ user.getUsername() + "</p>");
		out.println("<p>Age : "+ user.getAge() + "</p>");
		out.println("<a href='logout'>Me deconnecter</a>");
		out.println("</body>");
		out.println("</html>");
	}

	@Override
protected void doPost(
		HttpServletRequest request,
		HttpServletResponse response)
		throws ServletException,IOException {
}
}
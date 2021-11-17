package projetArticle.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/session")
public class Session extends HttpServlet {
	
	public Session(){}
	
	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException,IOException {
		
		HttpSession session = request.getSession();		


		Source: https://prograide.com/pregunta/28179/quotinstancierquot-une-liste-en-java 
		
		
		
		
		ServletOutputStream out = response.getOutputStream();
		session.setAttribute("USER", user);
		session.setAttribute("ARTICLE", articles);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>page de connexion</h1>");
		out.println("<h3>vous êtes bien connecté sur notre site</h3>");
		//out.println("<a href='userinfo'>Voir mes infos utilisateur</a>");
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
package projetArticle.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import projetArticle.model.Article;
import projetArticle.model.User;

/**
 * Servlet implementation class Accueil
 */
@SuppressWarnings("serial")
@WebServlet("/utilisateur")
public class Utilisateur extends HttpServlet {
	
	private HashMap<String, User> users = new HashMap<String, User>();
    /**
     * Default constructor. 
     */
    public Utilisateur() {
		Article voiture = new Article("254827", "voiture", "BMW");
		Article voiture1 = new Article("456789", "voiture", "AUDI");
		Article voiture2 = new Article("528596", "voiture", "RENAULT");
		Article voiture3 = new Article("253614", "voiture", "TOYOTA");
		List<Article> articles = new ArrayList<Article>();
		articles.add(voiture);
		articles.add(voiture1);
		articles.add(voiture2);
		articles.add(voiture3);
		User admin = new User("123456", "nico", articles, "nico.gmail.com", "admin");
		users.put("admin", admin);
		
		Article voitureA = new Article("253327", "voiture", "ALPHA-ROMEO");
		Article voitureB = new Article("454489", "voiture", "TOYOTA");
		List<Article> articlesB = new ArrayList<Article>();
		articlesB.add(voitureA);
		articlesB.add(voitureB);
		User bob = new User("123457", "bob", articlesB, "bob.gmail.com", "bob");
		users.put("bob", bob);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("name");
		request.setAttribute("name", userName);
        if (users.containsKey(userName)) {
        	User user = users.get(userName);
        	String userInfo = "";
        	userInfo += "<h1>Informations utilisateur</h1>";
        	userInfo += "<p>UID : "+ user.getUID() + "</p>";
        	userInfo += "<p>Username : "+ user.getUsername() + "</p>";
        	userInfo +="<p>Articles : "+ user.getArticles() + "</p>";
        	userInfo +="<p>Email : "+ user.getEmail() + "</p>";
        	userInfo +="<p>Role : "+ user.getRole() + "</p>";
        	userInfo += "<a href='logout'>Me deconnecter</a>";
        	request.setAttribute("userInfo", userInfo);
        }
        this.getServletContext().getRequestDispatcher("/WEB-INF/utilisateur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

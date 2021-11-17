package projetArticle.model;

import java.util.List;

public class User {
		
		private String UID;
		private String username;
		private List<Article> articles;
		private String email;
		private String role;
		
		
		public User(){}


		public User(String uID, String username, List<Article> articles, String email, String role) {
			super();
			UID = uID;
			this.username = username;
			this.articles = articles;
			this.email = email;
			this.role = role;
		}


		public String getUID() {
			return UID;
		}


		public void setUID(String uID) {
			UID = uID;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public List<Article> getArticles() {
			return articles;
		}


		public void setArticles(List<Article> articles) {
			this.articles = articles;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getRole() {
			return role;
		}


		public void setRole(String role) {
			this.role = role;
		}
	
	}	
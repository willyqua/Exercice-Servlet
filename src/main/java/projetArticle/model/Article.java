package projetArticle.model;

public class Article {
	
	private String UID;
	private String article;
	private String titre;
	
	public Article(){}

	public Article(String uID, String article, String titre) {
		super();
		UID = uID;
		this.article = article;
		this.titre = titre;
	}

	public String getUID() {
		return UID;
	}

	public void setUID(String uID) {
		UID = uID;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	

}

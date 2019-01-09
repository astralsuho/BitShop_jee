package dao;

public class ArticleDAOImpl {
	private static ArticleDAOImpl instance = new ArticleDAOImpl();
	private ArticleDAOImpl() {}
	public static ArticleDAOImpl getInstance() {return instance;}
	
	
}

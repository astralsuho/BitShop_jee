package service;

public class ArticleServiceImpl {
	private static ArticleServiceImpl instance = new ArticleServiceImpl();
	private ArticleServiceImpl() {}
	public static ArticleServiceImpl getInstance() {return instance;}

	
}

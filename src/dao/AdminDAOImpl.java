package dao;

public class AdminDAOImpl {
	private static AdminDAOImpl instance = new AdminDAOImpl();
	private AdminDAOImpl() {}
	public static AdminDAOImpl getInstance() {return instance;}

	
}

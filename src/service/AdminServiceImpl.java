package service;

public class AdminServiceImpl implements AdminService {
	private static AdminServiceImpl instance = new AdminServiceImpl();
	private AdminServiceImpl() {}
	public static AdminServiceImpl getInstance() {return instance;}
		
}

package service;

import java.util.ArrayList;

import domain.AccountBean;

public class AccountServiceImpl implements AccountService{
	private ArrayList<AccountBean> list;
	public AccountServiceImpl() {
		list = new ArrayList<>();
	}
	@Override
	public String openAccount(int money) {
		String accountNum = "1234-5678";
		AccountBean account = new AccountBean();
		account.setAccountNum("");
		account.setMoney(0);
		account.setToday("");
		list.add(account);
		return accountNum;
	}
	@Override
	public AccountBean findByAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

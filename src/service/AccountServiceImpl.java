package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import domain.AccountBean;

public class AccountServiceImpl implements AccountService{
	private ArrayList<AccountBean> list;

	public AccountServiceImpl() {
		list = new ArrayList<>();
	}

	@Override
	public void openAccount(int money) {
		AccountBean bean = new AccountBean();
		bean.setAccountNum(createAccountNum());
		bean.setMoney(money);
		bean.setToday(findDate());
		list.add(bean);

	}

	@Override
	public String createAccountNum() {
		Random random = new Random();
		String account = "";
		int[] a = new int[10];

		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				a[i] += random.nextInt(9);
				account += a[i] + "-";
			} else {
				a[i] += random.nextInt(9);
				account += a[i] + "";
			}
		}
		return account;
	}

	@Override
	public String findDate() {
		Date date = new Date();
		SimpleDateFormat today = new SimpleDateFormat("yyyy-MM-dd");
		return today.format(date);

	}

	@Override
	public ArrayList<AccountBean> findAll() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean bean = new AccountBean();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum)) {

				bean = list.get(i);
			}
		}
		return bean;

	}

	@Override
	public int countAccount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		boolean exist = false;
		for (int i = 0; i < list.size(); i++) {
			if (createAccountNum().equals(accountNum)) {
				exist = true;
			}
		}
		return exist;
	}

	@Override
	public void depositMoney(String accountNum, int money) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum)) {
				list.get(i).setMoney(list.get(i).getMoney() + money);

				break;
			}

		}
	}

	@Override
	public void withdrawMoney(String accountNum, int money) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum)) {
				list.get(i).setMoney(list.get(i).getMoney()-money);

				break;
			}
		}
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		for(int i=0;i<list.size();i++) {
		/*	if() {
				
			}*/
			
		}
		
	}

}

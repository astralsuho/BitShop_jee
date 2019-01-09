package service;

import java.util.ArrayList;

import dao.MemberDAO;
import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	
	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {
		dao = MemberDAOImpl.getInstance();
	}
	public static MemberServiceImpl getInstance() {return instance;}
	
	MemberDAOImpl dao;
	
	@Override
	public void createMember(MemberBean member) {
		dao.insertMember(member);
		
	}

	@Override
	public ArrayList<MemberBean> findAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public MemberBean findMemberById(String id) {
		MemberBean member = new MesmberBean();
		member = dao.selectMemberById(id);
		return member;
	}

	@Override
	public int countMembers() {
		int count = 0;
		return count;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean exist = false;
		return exist;
	}

	@Override
	public void changeMember(MemberBean member) {
		
	}

	@Override
	public void removeMember(String id) {
		
	}

}

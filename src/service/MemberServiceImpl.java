package service;

import java.util.ArrayList;

import domain.MemberBean;

public class MemberServiceImpl implements MemberService{

	@Override
	public void joinMember(MemberBean member) {
		System.out.println("멤버서비스 조인에 진입");
		System.out.println("===컨트롤러에서 넘어온 회원정보===");
		System.out.println("ID :"+member.getId());
		System.out.println("이름 :"+member.getName());
		System.out.println("비번 :"+member.getPass());
		System.out.println("주민번호 :"+member.getSsn());
		
	}

	@Override
	public ArrayList<MemberBean> listMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberBean> findByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMembers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existMember() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateMember() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember() {
		// TODO Auto-generated method stub
		
	}

}

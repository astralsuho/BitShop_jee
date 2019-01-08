package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
	public void joinMember(MemberBean member);
	public ArrayList<MemberBean> listMembers();
	public ArrayList<MemberBean> findByName();
	public MemberBean findById(String id);
	public int countMembers();
	public boolean existMember();
	public void updateMember();
	public void deleteMember();
}

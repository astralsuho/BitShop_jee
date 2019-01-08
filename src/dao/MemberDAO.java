package dao;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberDAO {
	public void createMember();
	public ArrayList<MemberBean> selectMembers();
	public ArrayList<MemberBean> selectByName();
	public MemberBean selectById();
	public int countMembers();
	public void updateMember();
	public void deleteMember();
}

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import domain.MemberBean;
import factory.DatabaseFactory;
import pool.Constant;

public class MemberDAOImpl implements MemberDAO{
	
	private static MemberDAOImpl instance = new MemberDAOImpl();
	private MemberDAOImpl() {}
	public static MemberDAOImpl getInstance() {return instance;	}
	
	ResultSet rs;
	
	@Override
	public void insertMember(MemberBean member) {
		try {
			int rs = DatabaseFactory
			.createDatabase("oracle")
			.getConnection()
			.createStatement()
			.executeUpdate(String.format(
					"INSERT INTO member(id, name, pass, ssn) \n"
					+ "VALUES('%s', '%s', '%s', '%s')",
					member.getId(),member.getName(),
					member.getPass(), member.getSsn()));
			if(rs == 1) {
				System.out.println("회원가입 성공");
			}else {
				System.out.println("회원가입 실패");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<MemberBean> selectAllMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberBean> selectMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			ResultSet rs = DatabaseFactory.createDatabase("")
			.getConnection()
			.createStatement()
			.executeQuery("");
			while(rs.next()) {
				list.add(null);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public MemberBean selectMemberById(String id) {
		MemberBean member = null;
		try {
			ResultSet rs = DatabaseFactory
				.createDatabase("oracle")
				.getConnection()
				.createStatement()
				.executeQuery(
						String.format("SELECT * FROM member\n" + 
								"WHERE id LIKE '%s'", id));
			while(rs.next()) {
				member = new MemberBean();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPass(rs.getString("pass"));
				member.setSsn(rs.getString("ssn"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}

	@Override
	public int countMembers() {
		int count  = 0;
		try {
			Class.forName("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public void updateMember(MemberBean member) {
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteMember(String id) {
		try {
			Class.forName("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

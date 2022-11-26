package com.mission.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mission.domain.MemberVO;

public class MemberDao {

	private Connection con = null;

	public MemberDao() {
		try {
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<MemberVO> getMembers() {
		Statement st = null;
		ResultSet rs = null;
		List<MemberVO> list = new ArrayList<>();
		try {
			st = con.createStatement();
			rs = st.executeQuery("select *from member order by id asc");
			while (rs.next()) {
				MemberVO m = new MemberVO();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("pass"));
				m.setPass(rs.getString("name"));
				m.setRigidate(rs.getDate("regidate"));
				list.add(m);
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				rs.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
//
//	public MemberVO getMember(int id) {
//		for (MemberVO key : list)
//			if (key.getId() == id) {
//				return key;
//			}
//		return null;
//	}
//
//	public MemberVO getaddMember(MemberVO add) {
//		add.setId(list.size() + 1);
//		add.setRigidate(new Date());
//		list.add(add);
//		return add;
//	}
//
//	public MemberVO getupdateMember(MemberVO edit) {
//		for (MemberVO key : list) {
//			if (key.getId() == edit.getId()) {
//				edit.setId(1);
//				edit.setName(key.getName());
//				return key;
//			}
//		}
//		return null;
//	}
//
//	public MemberVO getromoveMember(int id) {
//		for (MemberVO key : list) {
//			if (id == key.getId()) {
//				list.remove(key);
//				return key;
//			}
//		}
//		return null;
//	}
}

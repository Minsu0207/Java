package com.mission.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

		List<MemberVO> list = new ArrayList<>();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			rs = st.executeQuery("select * from member");

			while (rs.next()) {
				MemberVO m = new MemberVO();
				m.setId(rs.getString("id"));
				m.setName(rs.getString("name"));
				m.setPass(rs.getString("pass"));
				m.setRegidate(rs.getDate("regidate"));
				list.add(m);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
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

	public MemberVO getMember(String id) {
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			rs = st.executeQuery(String.format("select * from member where id='%s'", id));

			rs.next();
			MemberVO m = new MemberVO();
			m.setId(rs.getString("id"));
			m.setName(rs.getString("name"));
			m.setPass(rs.getString("pass"));
			m.setRegidate(rs.getDate("regidate"));
			return m;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	public MemberVO postMember(MemberVO m) {
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement("insert into member (id, name, pass, regidate) values (?, ?, ?, ?)");
			pst.setString(1, m.getId());
			pst.setString(2, m.getName());
			pst.setString(3, m.getPass());
			pst.setDate(4, new Date(System.currentTimeMillis()));

			if (pst.executeUpdate() == 1)
				return getMember(m.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public MemberVO putMember(MemberVO m) {
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement("update member set name=? where id = ?");
			pst.setString(2, m.getId());
			pst.setString(1, m.getName());
			pst.executeUpdate();
			if (pst.executeUpdate() == 1)
				return getMember(m.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public MemberVO deleteMember(String id) {
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			rs = st.executeQuery(String.format("select * from member where id='%s'", id));

			rs.next();
			MemberVO m = new MemberVO();
			m.setId(rs.getString("id"));
			m.setName(rs.getString("name"));
			m.setPass(rs.getString("pass"));
			m.setRegidate(rs.getDate("regidate"));
			return m;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}
}

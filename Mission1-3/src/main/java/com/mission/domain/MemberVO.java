package com.mission.domain;

import java.util.Date;

public class MemberVO {
	private int id;
	private String name;
	private String pass;
	private Date rigidate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Date getRigidate() {
		return rigidate;
	}

	public void setRigidate(Date rigidate) {
		this.rigidate = rigidate;
	}

	public MemberVO(int id, String name, String pass, Date rigidate) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.rigidate = rigidate;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + ", pass=" + pass + ", rigidate=" + rigidate + "]";
	}

	public MemberVO() {
		// TODO Auto-generated constructor stub
	}

}

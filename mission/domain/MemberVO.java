package com.mission.domain;

import java.util.Date;

public class MemberVO {
//id 타입 String, int 필드 속성, 바꿔가면서 반복 
	private int id;
	private String name;
	private String pass;
	private Date regidate;

	public MemberVO() {
	};

	public MemberVO(int id, String name, String pass, Date regidate) {
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.regidate = regidate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Date getRegidate() {
		return regidate;
	}

	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}

	public String toString() {
		return name + " " + id + " " + pass + " " + regidate;
	}

}

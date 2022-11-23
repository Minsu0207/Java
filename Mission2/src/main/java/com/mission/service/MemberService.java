package com.mission.service;

import java.util.List;

import com.mission.dao.MemberDao;
import com.mission.domain.MemberVO;

public class MemberService {

	private MemberDao memberDao;
	
	public MemberService() {
		memberDao = new MemberDao();
	}

	public List<MemberVO> getMembers() {
		System.out.println("Service - getMembers()");
		return memberDao.getMembers();
	}

	public MemberVO getMember(String id) {
		System.out.printf("Service - getMember(%s)\n", id);
		return memberDao.getMember(id);
	}

	public MemberVO postMember(MemberVO m) {
		System.out.println("Service - postMember(m) - " + m);
		return memberDao.postMember(m);
	}



}

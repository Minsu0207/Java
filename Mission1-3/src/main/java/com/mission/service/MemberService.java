package com.mission.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mission.dao.MemberDao;
import com.mission.domain.MemberVO;

public class MemberService {

	MemberDao memberDao = new MemberDao();

	public MemberService() {

	}

	public List<MemberVO> getMembers() {

		return memberDao.getMembers();
	}

//	public MemberVO getMember(int id) {
//
//		return memberDao.getMember(id);
//	}
//
//	public MemberVO getaddMember(MemberVO add) {
//
//		return memberDao.getaddMember(add);
//	}
//
//	public MemberVO getupdateMember(MemberVO edit) {
//
//		return memberDao.getupdateMember(edit);
//	}
//
//	public MemberVO getremoveMember(int id) {
//
//		return memberDao.getromoveMember(id);
//	}

}

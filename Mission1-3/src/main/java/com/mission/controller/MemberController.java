package com.mission.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mission.domain.MemberVO;
import com.mission.service.MemberService;

@RestController
public class MemberController {

	private MemberService mb = new MemberService();

	@GetMapping("/member")
	public List<MemberVO> getMembers() {
		return mb.getMembers();
	}

//	@GetMapping("/member/{id}")
//	public MemberVO getMember(@PathVariable Integer id) {

//		return mb.getMember(id);
//	}
//
//	@PostMapping("/member")
//	public MemberVO addMember(MemberVO add) {
//
//		return mb.getaddMember(add);
//	}
//
//	@PutMapping("/member")
//	public MemberVO updateMember(MemberVO edit) {
//
//		return mb.getupdateMember(edit);
//	}
//
//	@DeleteMapping("/member/{id}")
//	public MemberVO removeMember(@PathVariable Integer id) {
//
//		return mb.getremoveMember(id);
//	}
}

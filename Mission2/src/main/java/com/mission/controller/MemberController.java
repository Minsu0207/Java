package com.mission.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mission.domain.MemberVO;
import com.mission.service.MemberService;

@RestController
public class MemberController {

	private MemberService memberService;
	
	public MemberController() {
		MemberService memberService = new MemberService(); 
	}
	
	//Read	: Get
	@GetMapping("/member")
	public List<MemberVO> getMembers() {
		System.out.println("Controller - getMembers()");
		return memberService.getMembers();
	}

	@GetMapping("/member/{id}")
	public MemberVO getMember(@PathVariable String id) {
		System.out.printf("Controller - getMember(%s)\n", id);
		return memberService.getMember(id);
	}	
	
	//Create: Post
	@PostMapping("/member")
	//public MemberVO postMember(String id, String name, String pass) {
	public MemberVO postMember(MemberVO m) {
		return memberService.postMember(m);
	}
	
	//Update: Put
//	@PutMapping("/member")
//	public void putMember() {
//		memberService.putMember();
//	}
	//Delete: Delete
//	@DeleteMapping("/member")
//	public void deleteMember() {
//		memberService.deleteMember();
//	}
}

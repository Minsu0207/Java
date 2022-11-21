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

@RestController
public class MemberController {
	// 데이터 저장할 변수 list 선언
	private List<MemberVO> list;

	public MemberController() {
		// controller 생성 확인
		System.out.println("Controller 생성");
		// 객채생성 반복문 돌면서 list에 데이터 저장
		list = new ArrayList<MemberVO>();
		for (int i = 1; i <= 10; i++) {
			list.add(new MemberVO(i, "name" + i, "1234", new Date()));
		}
	}

	@GetMapping("/member")
	public List<MemberVO> getMembers() {
		return list;
	}

	@GetMapping("/member/{id}")
	public MemberVO getMember(@PathVariable Integer id) {
		for (MemberVO m : list) {
			if (m.getId() == id)
				return m;
		}
		System.out.println("데이터가 존재하지 않습니다.");
		return null;
	}

	@PostMapping("/member")
	public MemberVO addMember(MemberVO newmember) {
		return newmember;
	}

	@PutMapping("/member")
	public MemberVO updateMembers(MemberVO editmember) {
		return editmember;
	}

//	@DeleteMapping("member/{id}")
//	public MemberVO removeMember(@PathVariable Integer id) {
//		for (MemberVO m : list) {
//			if (m.getId() == id) {
//				list.remove(id);
//				
//			}
//		}
//	}

}

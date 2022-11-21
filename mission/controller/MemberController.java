package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.domain.MemberVO;

@RestController
//기본 생성자
public class MemberController {
	List<MemberVO> list = new ArrayList<>();

	public MemberController() {
		for (int i = 0; i <= 10; i++) {
//			MemberVO key = new MemberVO();
//			key.setId(i);
//			key.setName("name"+i);
//			key.setPass("123");
//			key.setRegidate(new Date());
//			key.setRegidate(new Date());
//			list.add(key);
			// 위에 주석처리된 코드를 한줄로 구현
			list.add(new MemberVO(i, "name" + i, "123", new Date()));
		}

	}

	@GetMapping("/member")
	public List<MemberVO> getMembers() {
		return list;
	}

	@GetMapping("/member/{id}")
	public MemberVO getMember(@PathVariable Integer id) {
		for (MemberVO key : list) {
			if (id == key.getId())
					return key;
		}
		return null;
	}
	
	@PostMapping("/member")
	public MemberVO addMembers(MemberVO memberVO) {
		return null;
	}
	
	@PutMapping("/member")
	public MemberVO updateMembers(MemberVO memberVO) {
		return null;
	}
	
	@DeleteMapping("/member/{id}")
	public MemberVO removeMember(@PathVariable Integer id) {
			for (MemberVO key : list) {
				if (id == key.getId())
						return key;
			}
			return null;
	}
	
}

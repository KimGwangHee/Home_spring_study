package com.example.spring01.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring01.model.dto.MemberDTO;
import com.example.spring01.service.MemberService;

@Controller
public class MemberController {
	private static final Logger logger=
			LoggerFactory.getLogger(MemberController.class);
	
	@Inject // MemberService ��ü�� ���Ե�
	MemberService memberService;
	
	@RequestMapping("member/list.do") // ����ڰ� ��û�ϴ� �ּ�
	public String memberList(Model model) {
		List<MemberDTO> list= memberService.memberList();
		logger.info("ȸ�����:"+ list);
		model.addAttribute("list", list); // �𵨿� ����
		return "member/member_list"; // ��� �������� ������
	}
	
}

package com.example.spring01.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.spring01.model.dao.MemberDAO;
import com.example.spring01.model.dao.MemberDAOImpl;
import com.example.spring01.model.dto.MemberDTO;


@Service
// 스프리엥서 서버가올라올때 서비스의 객체를 생성하지않곡도 서비스를 이용할수잇음
public class MemberServiceImpl implements MemberService {

	
	@Inject // 스프링컨테이너가 만든 dao 객체가 연결됨 ( 의존관계 주입)
	MemberDAO memberDao;
		
	@Override
	public List<MemberDTO> memberList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertMember(MemberDTO dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public MemberDTO viewMember(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMember(String userid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateMember(MemberDTO dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean checkPw(String userid, String passwd) {
		// TODO Auto-generated method stub
		return false;
	}

}

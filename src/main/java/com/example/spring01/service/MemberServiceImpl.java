package com.example.spring01.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.spring01.model.dao.MemberDAO;
import com.example.spring01.model.dao.MemberDAOImpl;
import com.example.spring01.model.dto.MemberDTO;


@Service
// ���������� �������ö�ö� ������ ��ü�� ���������ʰ ���񽺸� �̿��Ҽ�����
public class MemberServiceImpl implements MemberService {

	
	@Inject // �����������̳ʰ� ���� dao ��ü�� ����� ( �������� ����)
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
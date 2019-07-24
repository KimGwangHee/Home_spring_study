package com.example.spring01.model.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.spring01.model.dto.MemberDTO;


@Repository // ������ startup �ɶ� ��Ŭ���� �޷ο� �ڵ����� ��ϵ�
public class MemberDAOImpl implements MemberDAO {
	
	private static final Logger logger=
			LoggerFactory.getLogger(MemberDAOImpl.class);
	
	@Inject
	SqlSession sqlSession;
	
	@Override 
	public List<MemberDTO> memberList() {
		// sql mapper�� �ۼ��� sql �ڵ尡 ����� ( �ڵ����� Ŀ�԰� Ŭ��� �ȴ�)
		return sqlSession.selectList("member.memberList");
	}

	@Override
	public void insertMember(MemberDTO vo) {
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
	public void updateMember(MemberDTO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean checkPw(String userid, String passwd) {
		// TODO Auto-generated method stub
		return false;
	}

}

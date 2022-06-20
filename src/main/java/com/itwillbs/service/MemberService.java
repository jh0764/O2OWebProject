package com.itwillbs.service;

import java.util.HashMap;

import com.itwillbs.domain.MemberDTO;



public interface MemberService {
	//추상메서드 정의
	public void insertMember(MemberDTO memberDTO);
	
	public MemberDTO userCheck(MemberDTO memberDTO);
	
	public MemberDTO getMember(int id);
	
	public void updateMember(MemberDTO memberDTO);


}

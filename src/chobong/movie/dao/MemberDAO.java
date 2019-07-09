package chobong.movie.dao;

import java.util.List;

import chobong.movie.dto.MemberDTO;

public interface MemberDAO {
	/** 등록전에 id중복체크 
	  select id from member where id=?    
	  @return true이면 중복, 
	             false이면 중복아님   */
	boolean idCheck(String id);
	
	MemberDTO memberInfo(String memberId);
	
	int login(String memberId, String memberPwd);
	/**
	 * Member 등록하기
	 * */
	int insert(MemberDTO memberDTO);
	
	/**
	 * id에 해당하는 레코드 삭제하기
	 * */
	int delete(String id);
	
	/**
	 * id에 해당하는 레코드 수정하기
	 * */
	int update(MemberDTO memberDTO);

}

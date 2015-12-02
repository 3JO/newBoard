package org.jesse.persistence;

import org.jesse.domain.MemberVO;

public interface MemberMapper extends CRUDMapper<MemberVO, String> {
	
	public String getTime();

}
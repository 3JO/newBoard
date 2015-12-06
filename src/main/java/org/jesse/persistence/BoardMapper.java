package org.jesse.persistence;

import java.util.List;

import org.jesse.domain.BoardVO;
import org.jesse.domain.Criteria;

public interface BoardMapper extends CRUDMapper<BoardVO, Integer> {
	
	public List<BoardVO> listAll() throws Exception;
	
	public List<BoardVO> search(Criteria cri) throws Exception;
	
	public int searchCount(Criteria cri)throws Exception;
}

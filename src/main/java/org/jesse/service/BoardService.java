package org.jesse.service;

import java.util.List;

import org.jesse.domain.BoardVO;
import org.jesse.domain.Criteria;

public interface BoardService {

	public void regist(BoardVO vo) throws Exception;

	public BoardVO read(Integer bno) throws Exception;

	public void modify(BoardVO vo) throws Exception;

	public void remove(Integer bno) throws Exception;

	public List<BoardVO> listAll() throws Exception;
	
	public List<BoardVO> search(Criteria cri) throws Exception;
}

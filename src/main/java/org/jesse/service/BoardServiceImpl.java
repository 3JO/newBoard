package org.jesse.service;

import java.util.List;

import org.jesse.domain.BoardVO;
import org.jesse.persistence.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void regist(BoardVO vo) throws Exception {
		mapper.create(vo);
	}
	
	@Override
	public BoardVO read(Integer bno) throws Exception {
		return mapper.read(bno);
	}
	
	@Override
	public void modify(BoardVO vo) throws Exception {
		mapper.update(vo);
	}
	
	@Override
	public void remove(Integer bno) throws Exception {
		mapper.delete(bno);
	}
	
	@Override
	public List<BoardVO> listAll() throws Exception {
		return mapper.listAll();
	}
}

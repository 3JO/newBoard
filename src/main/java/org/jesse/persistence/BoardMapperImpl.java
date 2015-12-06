package org.jesse.persistence;

import java.util.List;

import org.jesse.domain.BoardVO;
import org.jesse.domain.Criteria;
import org.springframework.stereotype.Repository;

@Repository
public class BoardMapperImpl extends AbstractCRUDMapper<BoardVO, Integer> implements BoardMapper {

	@Override
	public List<BoardVO> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}

	@Override
	public List<BoardVO> search(Criteria cri) throws Exception {
		return session.selectList(namespace + ".search", cri);
	}

	@Override
	public int searchCount(Criteria cri) throws Exception {
		return session.selectOne(namespace + ".searchCount", cri);
	}
}

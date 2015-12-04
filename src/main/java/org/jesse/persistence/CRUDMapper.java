package org.jesse.persistence;

import java.util.List;

import org.jesse.domain.BoardVO;
import org.jesse.domain.Criteria;

public interface CRUDMapper<V, K> {

	public void create(V vo) throws Exception;
	
	public V read(K key) throws Exception;
	
	public void update(V vo) throws Exception;
	
	public void delete(K key) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
	
	public List<BoardVO> search(Criteria cri) throws Exception;
	
	public int searchCount(Criteria cri)throws Exception;
}

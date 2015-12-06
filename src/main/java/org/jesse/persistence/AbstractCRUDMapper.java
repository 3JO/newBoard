package org.jesse.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.jesse.domain.BoardVO;
import org.jesse.domain.Criteria;
import org.springframework.beans.factory.annotation.Autowired;

abstract class AbstractCRUDMapper<V, K> implements CRUDMapper<V, K> {
	
	@Autowired
	protected SqlSession session;
	
	protected String namespace;
	
	public AbstractCRUDMapper() {
		
		String name = this.getClass().getName();
		this.namespace= name.substring(0, name.length()-4);
	}
	
	@Override
	public void create(V vo) throws Exception {
		session.insert(namespace + ".create", vo);
		
	}

	@Override
	public V read(K key) throws Exception {
		return session.selectOne(namespace + ".read", key);
	}

	@Override
	public void update(V vo) throws Exception {
		session.update(namespace + ".update", vo);
	}

	@Override
	public void delete(K key) throws Exception {
		session.delete(namespace+".delete", key);
		
	}
	

	
}

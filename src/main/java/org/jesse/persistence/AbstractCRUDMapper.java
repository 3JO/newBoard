package org.jesse.persistence;

import org.apache.ibatis.session.SqlSession;
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
	public V update(V vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(K key) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
}

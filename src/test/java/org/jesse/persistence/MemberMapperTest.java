package org.jesse.persistence;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberMapperTest extends DataSourceTest {

	@Autowired
	private MemberMapper mapper;

	@Test
	public void test() {
		logger.info(mapper.getTime());
	}

}

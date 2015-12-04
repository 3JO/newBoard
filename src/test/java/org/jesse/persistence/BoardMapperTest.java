package org.jesse.persistence;

import org.jesse.domain.BoardVO;
import org.jesse.domain.Criteria;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })

public class BoardMapperTest extends DataSourceTest {

	@Autowired
	private BoardMapper mapper;

	@Test
	public void CreateTest() throws Exception {

		BoardVO vo = new BoardVO();
		vo.setTitle("TEST TITLE 2");
		vo.setContent("testContents 2, 컨텐트테스트");
		vo.setWriter("tester32");

		mapper.create(vo);

	}

	@Test
	public void ReadTest() throws Exception {

		mapper.read(8);

	}

	@Test
	public void UpdateTest() throws Exception {

		BoardVO vo = new BoardVO();
		vo.setBno(8);
		vo.setTitle("UPDATE TEST TITLE");
		vo.setContent("updateTestContents, 업데이트 컨텐트테스트");

		mapper.update(vo);

	}

	@Test
	public void DeleteTest() throws Exception {

		mapper.delete(6);

	}

	@Test
	public void listAllTest() throws Exception {
		mapper.listAll();
	}

	@Test
	public void SearchTest() throws Exception {
		Criteria cri = new Criteria();
		cri.setPage(2);
		cri.setPerPage(20);
		cri.setSearchType("t");
		cri.setKeyword("00");

		System.out.println(mapper.search(cri));
		logger.info(mapper.search(cri).toString());
	}

}

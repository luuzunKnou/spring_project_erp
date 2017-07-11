package com.luuzun.project_erp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.luuzun.persistence.ErpDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ErpDAOTest {
	
	@Autowired
	private ErpDAO dao;
	
	@Test
	public void testSelectByAll() throws Exception{
		dao.selectAll();
	}
}

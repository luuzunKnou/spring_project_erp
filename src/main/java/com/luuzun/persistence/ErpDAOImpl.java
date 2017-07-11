package com.luuzun.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luuzun.domain.ProjectInfo;

@Repository
public class ErpDAOImpl implements ErpDAO{
	@Autowired
	private SqlSession session;

	private static String namespace = "com.luuzun.persistence.ErpDAO.";

	@Override
	public void insert(ProjectInfo projectInfo) throws Exception {
		session.insert(namespace +"insert",projectInfo);
	}

	@Override
	public ProjectInfo selectOne(Integer pNo) throws Exception {
		return session.selectOne(namespace +"selectOne",pNo);
	}

	@Override
	public void update(ProjectInfo projectInfo) throws Exception {
		session.update(namespace +"update",projectInfo);
	}

	@Override
	public void delete(Integer pNo) throws Exception {
		session.delete(namespace +"delete", pNo);
	}

	@Override
	public List<ProjectInfo> selectAll() throws Exception {
		return session.selectList(namespace +"selectAll");
	}
}
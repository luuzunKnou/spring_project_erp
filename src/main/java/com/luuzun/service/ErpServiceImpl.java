package com.luuzun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luuzun.domain.ProjectInfo;
import com.luuzun.persistence.ErpDAO;

@Service
public class ErpServiceImpl implements ErpService  {
	@Autowired
	private ErpDAO dao;

	@Override
	public void insert(ProjectInfo projectInfo) throws Exception {
		dao.insert(projectInfo);
	}

	@Override
	public ProjectInfo selectOne(Integer pNo) throws Exception {
		return dao.selectOne(pNo);
	}

	@Override
	public void update(ProjectInfo projectInfo) throws Exception {
		dao.update(projectInfo);
	}

	@Override
	public void delete(Integer pNo) throws Exception {
		dao.delete(pNo);
	}

	@Override
	public List<ProjectInfo> selectAll() throws Exception {
		
		List<ProjectInfo> list = dao.selectAll();
		for (ProjectInfo projectInfo : list) {
			System.out.println(projectInfo);
		}
		
		return dao.selectAll();
	}
	
	
}
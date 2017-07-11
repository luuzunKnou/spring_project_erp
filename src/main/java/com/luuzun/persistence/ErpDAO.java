package com.luuzun.persistence;

import java.util.List;

import com.luuzun.domain.ProjectInfo;

public interface ErpDAO {
	public void 		 	 insert(ProjectInfo projectInfo)  	throws Exception;
	public ProjectInfo 		 selectOne(Integer pNo)  			throws Exception;
	public void 		 	 update(ProjectInfo projectInfo)  	throws Exception;
	public void 		 	 delete(Integer pNo)    			throws Exception;
	public List<ProjectInfo> selectAll() 	  					throws Exception;
}

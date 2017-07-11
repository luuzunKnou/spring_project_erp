package com.luuzun.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectInfo {
	public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	private int 	projectNo;
	private String 	projectName;
	private String 	projectContent;
	private Date 	projectBeginDate;
	private Date 	projectEndDate;
	private String 	projectProgress;
	
	public ProjectInfo() {}

	public ProjectInfo(int projectNo, String projectName, String projectContent, Date projectBeginDate,
			Date projectEndDate, String projectProgress) {
		super();
		this.projectNo = projectNo;
		this.projectName = projectName;
		this.projectContent = projectContent;
		this.projectBeginDate = projectBeginDate;
		this.projectEndDate = projectEndDate;
		this.projectProgress = projectProgress;
	}

	@Override
	public String toString() {
		return String.format(
				"ProjectInfo [projectNo=%s, projectName=%s, projectContent=%s, projectBeginDate=%s, projectEndDate=%s, projectProgress=%s]",
				projectNo, projectName, projectContent, projectBeginDate, projectEndDate, projectProgress);
	}

	public int getProjectNo() {
		return projectNo;
	}

	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectContent() {
		return projectContent;
	}

	public void setProjectContent(String projectContent) {
		this.projectContent = projectContent;
	}

	public Date getProjectBeginDate() {
		return projectBeginDate;
	}
	
	public String getProjectBeginDateToString() {
		return simpleDateFormat.format(projectBeginDate);
	}

	public void setProjectBeginDate(Date projectBeginDate) {
		this.projectBeginDate = projectBeginDate;
	}

	public Date getProjectEndDate() {
		return projectEndDate;
	}

	public String getProjectEndDateToString() {
		return simpleDateFormat.format(projectEndDate);
	}
	
	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}

	public String getProjectProgress() {
		return projectProgress;
	}

	public void setProjectProgress(String projectProgress) {
		this.projectProgress = projectProgress;
	}
}

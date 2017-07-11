package com.luuzun.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.luuzun.domain.ProjectInfo;
import com.luuzun.service.ErpService;

@Controller
@RequestMapping("/erp/*")
public class ErpController {
	private static final Logger logger = LoggerFactory.getLogger(ErpController.class);

	@Autowired
	ErpService service;
	
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public String listAll(Model model) throws Exception{
		logger.info("Show All Content");
		model.addAttribute("projectInfoList",service.selectAll());
		return "showList";
	}
	
	@RequestMapping(value = "/listOne", method = RequestMethod.GET)
	public String listOne(Model model, int pNo) throws Exception{
		logger.info("Show Detail Content: " + service.selectOne(pNo));
		model.addAttribute("projectInfo",service.selectOne(pNo));
		return "showContent";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(int pNo) throws Exception{
		logger.info("Delete Content: " + pNo);
		service.delete(pNo);
		return "redirect:listAll";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateGET(Model model, int pNo){
		try {
			model.addAttribute("projectInfo",service.selectOne(pNo));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "modifyProjectForm";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updatePOST(ProjectInfo projectInfo, String endDate, String startDate){
		logger.info("Update Content: " + projectInfo);
		
		try {
			projectInfo.setProjectEndDate(ProjectInfo.simpleDateFormat.parse(endDate));
			projectInfo.setProjectBeginDate(ProjectInfo.simpleDateFormat.parse(endDate));
			service.update(projectInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:listAll";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insertGET(){
		return "insertProjectForm";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertPOST(ProjectInfo projectInfo, String endDate, String startDate){
		
		logger.info("Insert Content: " + projectInfo);
		
		try {
			projectInfo.setProjectEndDate(ProjectInfo.simpleDateFormat.parse(endDate));
			projectInfo.setProjectBeginDate(ProjectInfo.simpleDateFormat.parse(endDate));
			System.out.println(projectInfo);
			service.insert(projectInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:listAll";
	}
	
}

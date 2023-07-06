package com.phl.general.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.phl.common.dto.ItemResult;
import com.phl.general.report.common.dto.GradeUserDto;
import com.phl.general.report.service.GradeUserService;

import java.util.List;

@Controller
@RequestMapping("/grade-user")

public class GradeUserController {
	
	GradeUserService gradeUserService;
	@RequestMapping(value = "/view", method = { RequestMethod.GET })
	public ModelAndView viewGrade(GradeUserDto gradeUserDto) {
    	ModelAndView mav = new ModelAndView("grade.user");
    	System.out.println("Stack Trace @Controller");
    	ItemResult result = null; 
    	try {
    		result = gradeUserService.viewGradeUserCourse(gradeUserDto);
    	}catch(Exception ex) {
			ex.printStackTrace();
		}
    	return mav;
	}
}

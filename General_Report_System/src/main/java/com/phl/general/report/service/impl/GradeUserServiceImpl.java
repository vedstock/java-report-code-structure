package com.phl.general.report.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.phl.common.component.RestTemplateAPI;
import com.phl.common.config.PageWrapper;
import com.phl.common.contanst.MessageIdConst;
import com.phl.common.dto.ItemResult;
import com.phl.common.dto.RequestGWDto;
import com.phl.common.dto.ResponseEntityDto;
import com.phl.common.exception.BusException;

import com.phl.general.report.common.dto.GradeUserDto;
import com.phl.general.report.common.dto.GradeUserRequestDto; // Sending request content
import com.phl.general.report.common.dto.GradeUserResponseDto;// Receiving response from service
import com.phl.general.report.common.dto.MofUserDto;
import com.phl.general.report.common.constant.GradeMessageList;// Putting grade message string for sending
import com.phl.general.report.service.GradeUserService;

public class GradeUserServiceImpl implements GradeUserService {
	
	@Autowired
	RestTemplateAPI restTemplateAPI;
	
	public ItemResult viewGradeUserCourse(GradeUserDto gradeUserDto)	throws BusException, Exception {
		ItemResult itemResult = null;
		GradeUserRequestDto gradeUserRequestDto = new GradeUserRequestDto();
		RequestGWDto requestDto = new RequestGWDto(GradeMessageList.GRADE_MSG_ID_001, gradeUserRequestDto);
		ResponseEntityDto responseDto =  restTemplateAPI.postForEntity(MessageIdConst.METHOD_TRANSFER, requestDto);
		/*debug to find error*/
		System.out.println(responseDto.jsonData);
		System.out.println(" @Bottle ");
 		/*end debug*/
		return null;
	}
}

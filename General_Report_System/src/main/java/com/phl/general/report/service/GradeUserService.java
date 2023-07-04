package com.phl.general.report.service;

import com.phl.common.dto.ItemResult;
import com.phl.common.exception.BusException;
import com.phl.general.report.common.dto.GradeUserDto;

public interface GradeUserService {
	ItemResult viewGradeUserCourse(GradeUserDto gradeUserDto)	throws BusException, Exception;
}

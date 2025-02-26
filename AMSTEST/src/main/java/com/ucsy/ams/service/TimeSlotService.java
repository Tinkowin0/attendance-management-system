package com.ucsy.ams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucsy.ams.dto.CourseSemesterTimeSlotDto;
import com.ucsy.ams.repository.TimeSlotRepo;

@Service
public class TimeSlotService {

	@Autowired
	private TimeSlotRepo timeSlotRepo;

	public List<CourseSemesterTimeSlotDto> getAllTime() {
		return timeSlotRepo.getAllCourseDetail();
	}
}

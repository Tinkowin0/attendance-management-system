package com.ucsy.ams.repository;

import org.springframework.stereotype.Repository;

import com.ucsy.ams.dto.GetTimeSlotBySemesterIdDTO;

import java.util.List;

@Repository
public interface TimeSlotRepository {

	// not for me
	public List<GetTimeSlotBySemesterIdDTO> findTimeSlotForTeacher(int studentId);

	public List<GetTimeSlotBySemesterIdDTO> findTimeSlotForStudent(String semesterName, int studentId);
}

package com.ucsy.ams.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucsy.ams.dto.TeacherAccountDto;
import com.ucsy.ams.entity.Teachers;
import com.ucsy.ams.repository.TeacherAccountRepo;

@Service
public class TeacherAccountService {

	@Autowired
	private TeacherAccountRepo teacherAccountRepo;

	public List<TeacherAccountDto> getAllTeacher(String role) {
		return teacherAccountRepo.getAllTeacherList(role);
	}
	
	public TeacherAccountDto getEachTeacherById(int id) {
		return teacherAccountRepo.getTeacherById(id);
	}

	//not for me
	public Optional<Teachers> findById(int teacherId) {
		return teacherAccountRepo.findById(teacherId);
	}
}

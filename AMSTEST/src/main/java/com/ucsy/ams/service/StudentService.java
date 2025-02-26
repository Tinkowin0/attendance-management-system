package com.ucsy.ams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucsy.ams.dto.GetTimeSlotBySemesterIdDTO;
import com.ucsy.ams.dto.StudentRollCallDTO;
import com.ucsy.ams.repository.AttendanceRepository;
import com.ucsy.ams.repository.TimeSlotRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private  TimeSlotRepository timeSlotRepository;
    @Autowired
    private  AttendanceRepository attendanceRepository;

    public List<GetTimeSlotBySemesterIdDTO> getTimeSlotBySemesterId(String semesterName, int studentId) {
        return timeSlotRepository.findTimeSlotForStudent(semesterName, studentId);
    }
    
    public List<StudentRollCallDTO> findStudentRollCall(String startDate, String endDate, int studentId, String semId,String email){
        return attendanceRepository.findAttendanceByStudentAndCourse(startDate, endDate, studentId, semId, email);
    }
}

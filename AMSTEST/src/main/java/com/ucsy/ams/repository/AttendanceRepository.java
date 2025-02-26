package com.ucsy.ams.repository;

import com.ucsy.ams.dto.AttendanceByDateAllRecordDTO;
import com.ucsy.ams.dto.AttendanceDashboardDTO;
import com.ucsy.ams.dto.GetAttendanceByDateAndCourseDTO;
import com.ucsy.ams.dto.StudentRollCallDTO;

import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface AttendanceRepository {

	// not for me
	public List<AttendanceByDateAllRecordDTO> findAttendanceByDateAndSemester(Date start, Date end, int semId);

	// not for me
	public List<GetAttendanceByDateAndCourseDTO> findAttendanceByDateandCourse(Date start, Date end, int semId,
			int courseId);

	public List<AttendanceDashboardDTO> findAttendanceBySemester();

	public List<StudentRollCallDTO> findAttendanceByStudentAndCourse(String startDate, String endDate, int studentId,
			String semId, String email);
}

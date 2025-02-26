package com.ucsy.ams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ucsy.ams.entity.Attendance;

import jakarta.transaction.Transactional;

@Repository
public interface AttendanceRepo extends JpaRepository<Attendance, Integer> {
	
	@Modifying
	@Transactional
	@Query("delete from Attendance a where a.student.id = ?1")
	public void deleteStudentId(Integer stdId);
}

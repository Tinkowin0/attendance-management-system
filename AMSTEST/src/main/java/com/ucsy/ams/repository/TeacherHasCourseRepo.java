package com.ucsy.ams.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ucsy.ams.entity.TeacherHasCourse;

import jakarta.transaction.Transactional;

@Repository
public interface TeacherHasCourseRepo extends JpaRepository<TeacherHasCourse, Integer>{

	@Modifying
	@Transactional
	@Query("delete from TeacherHasCourse r where r.teacher.id = ?1")
	public void deleteTeacherId(Integer teachesId );
}

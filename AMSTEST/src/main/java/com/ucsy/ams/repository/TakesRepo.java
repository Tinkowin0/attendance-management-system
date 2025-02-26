package com.ucsy.ams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ucsy.ams.entity.Takes;

import jakarta.transaction.Transactional;

public interface TakesRepo extends JpaRepository<Takes, Integer>{

	@Modifying
	@Transactional
	@Query("delete from Takes t where t.student.id = ?1")
	public void deleteStudentId(Integer stdId );
}

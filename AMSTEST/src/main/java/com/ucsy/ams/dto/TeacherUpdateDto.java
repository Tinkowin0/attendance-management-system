package com.ucsy.ams.dto;

import java.sql.Date;

public record TeacherUpdateDto(
		 int id,
		 String name,
		 String email,
		 String role,
		 String nrcNo,
		 Date dob,
		 String phoneNo,
		 String teacherRank,
		 String highestDegree,
		 String faculty
		) {

}

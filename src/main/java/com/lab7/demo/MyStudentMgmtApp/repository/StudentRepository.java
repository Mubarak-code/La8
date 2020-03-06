package com.lab7.demo.MyStudentMgmtApp.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab7.demo.MyStudentMgmtApp.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	

}

package com.lab7.demo.MyStudentMgmtApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lab7.demo.MyStudentMgmtApp.model.Classroom;
import com.lab7.demo.MyStudentMgmtApp.model.Student;
import com.lab7.demo.MyStudentMgmtApp.model.Transcript;
import com.lab7.demo.MyStudentMgmtApp.repository.ClassRepository;
import com.lab7.demo.MyStudentMgmtApp.repository.StudentRepository;
import com.lab7.demo.MyStudentMgmtApp.repository.TranscriptRepository;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private TranscriptRepository transcriptRepo;
	
	@Autowired
	private ClassRepository classRepo;


	public static void main(String[] args) {
		SpringApplication.run(MyStudentMgmtAppApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Student> class1 = new ArrayList<Student>();
		List<Student> class2 = new ArrayList<Student>();
		
//		Student s1 = new Student(studentNumber, firstName, middleName, lastName, cgpa, dateOfEnrollement, transcript);
//		Classroom c1 = new Classroom(buildingName, roomNo)
		
		Transcript t1 = new Transcript("BSc. Computer Science");
		Transcript t2 = new Transcript("Msc Data Science");
		Student s1 = new Student("610-544", "Mubarak", "Adedayo", "Adeshina", 4.0, LocalDate.of(2019, 8, 10), t1);
		Student s2 = new Student("610-555", "Nahu", "Bek", "Xsron", 3.5, LocalDate.of(2019, 11, 07), t2);
		Student s3 = new Student("610-555", "Ben", "Bow", "Abdul", 4.0, LocalDate.of(2020, 11, 20), t2);
		Classroom c2 = new Classroom("Verill Hall", 32);
		Classroom c1 = new Classroom("McLaughlin", 108);
		
		s1.setClassroom(c1);
		s2.setClassroom(c1);
		s3.setClassroom(c2);
		
		class1.add(s1);
		class1.add(s2);
		class2.add(s3);
		
		c1.setStudent(class1);
		c2.setStudent(class2);
		
		transcriptRepo.save(t1);
		transcriptRepo.save(t2);
		
		classRepo.save(c1);
		classRepo.save(c2);
		
		studentRepo.save(s1);
		studentRepo.save(s2);
		studentRepo.save(s3);
		
		
		
	}

}

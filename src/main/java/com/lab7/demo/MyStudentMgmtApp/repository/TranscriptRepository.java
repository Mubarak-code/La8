package com.lab7.demo.MyStudentMgmtApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab7.demo.MyStudentMgmtApp.model.Transcript;


@Repository
public interface TranscriptRepository extends JpaRepository<Transcript, Long> {

}

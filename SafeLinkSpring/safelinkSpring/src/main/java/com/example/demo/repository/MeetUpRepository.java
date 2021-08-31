package com.example.demo.repository;

import java.awt.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.MeetUp;

@Repository
public interface MeetUpRepository extends JpaRepository<MeetUp, Long>{

	java.util.List<MeetUp> findAllMeetUpsById(Long id);
	
	MeetUp findMeetUpByid(Long id);

	


}



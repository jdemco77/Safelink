package com.example.demo.controllers;

import java.awt.List;
import java.util.Optional;

import org.apache.tomcat.jni.Time;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.MeetUp;
import com.example.demo.models.User;
import com.example.demo.repository.MeetUpRepository;


@RestController
public class MeetUpController {

private static Logger logger= LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private MeetUpRepository meetRepository;
	
	@GetMapping(value="/CreateMeetUp")
	public MeetUp CreateNewMeetUp(long participant1Id, long participant2id, String location, int duration, String expectedReturn,
			String leaveTime) {
		
		return new MeetUp( participant1Id, participant2id, location,  duration,  expectedReturn,
				leaveTime);
		
	}
	
	@GetMapping(value="/MeetUp/{meetid}")
	public Optional<MeetUp> findUserById(@PathVariable long meetupid) {
		
		Optional<MeetUp> meet= Optional.ofNullable(meetRepository.findMeetUpByid(meetupid));
		
		if(meet.isPresent()) {
			return meet;
		}
			
		String message= "No meeting with id: "+meetupid;
		logger.error(message);
		
		return null;
	}
	
	
	
	
	
	
	
	
	
}

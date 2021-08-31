package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.tomcat.jni.Time;

@Entity
@Table(name="MeetUp")
public class MeetUp {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	
	private long participant1Id;
	
	
	private long participant2id; 
	
	private String location;
	
	private int duration;
	
	private String expectedReturn;
	
	private String leaveTime;


	public long getParticipant1Id() {
		return participant1Id;
	}

	public void setParticipant1Id(long participant1Id) {
		this.participant1Id = participant1Id;
	}

	public long getParticipant2id() {
		return participant2id;
	}

	public void setParticipant2id(long participant2id) {
		this.participant2id = participant2id;
	}

	public MeetUp(long participant1Id, long participant2id, String location, int duration, String expectedReturn,
			String leaveTime) {
		super();
		this.participant1Id = participant1Id;
		this.participant2id = participant2id;
		this.location = location;
		this.duration = duration;
		this.expectedReturn = expectedReturn;
		this.leaveTime = leaveTime;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getExpectedReturn() {
		return expectedReturn;
	}

	public void setExpectedReturn(String expectedReturn) {
		this.expectedReturn = expectedReturn;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLeaveTime() {
		return leaveTime;
	}

	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}
	
	
	
	
	
}

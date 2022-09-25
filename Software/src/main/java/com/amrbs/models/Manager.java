package com.amrbs.models;

import java.util.Date;
import java.util.List;

public class Manager extends User
{
	
	private double credits;
	private Date lastLoggedIn;
	private List<Integer> meetingIDs, memberIDs;

	public Manager()
	{
		super();
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public Date getLastLoggedIn() {
		return lastLoggedIn;
	}

	public void setLastLoggedIn(Date lastLoggedIn) {
		this.lastLoggedIn = lastLoggedIn;
	}

	public List<Integer> getMeetingIDs() {
		return meetingIDs;
	}

	public void setMeetingIDs(List<Integer> meetingIDs) {
		this.meetingIDs = meetingIDs;
	}

	public List<Integer> getMemberIDs() {
		return memberIDs;
	}

	public void setMemberIDs(List<Integer> memberIDs) {
		this.memberIDs = memberIDs;
	}
	
	

}

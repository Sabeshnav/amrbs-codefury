package com.amrbs.models;

import java.util.List;

public class Member extends User
{
	
	private int managerID;
	private List<Integer> meetingIDs;

	public Member() 
	{
		super();
	}

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	public List<Integer> getMeetingIDs() {
		return meetingIDs;
	}

	public void setMeetingIDs(List<Integer> meetingIDs) {
		this.meetingIDs = meetingIDs;
	}
	
	

}

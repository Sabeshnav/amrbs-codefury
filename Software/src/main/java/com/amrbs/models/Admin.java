package com.amrbs.models;

import java.util.Date;
import java.util.List;

public class Admin extends User
{

	private Date lastLoggedIn;
	private List<Integer> meetingRoomIDs;
	
	public Admin()
	{
		super();
		
	}

	public Date getLastLoggedIn() {
		return lastLoggedIn;
	}

	public void setLastLoggedIn(Date lastLoggedIn) {
		this.lastLoggedIn = lastLoggedIn;
	}

	public List<Integer> getMeetingRoomIDs() {
		return meetingRoomIDs;
	}

	public void setMeetingRoomIDs(List<Integer> meetingRoomIDs) {
		this.meetingRoomIDs = meetingRoomIDs;
	}
	
	

}

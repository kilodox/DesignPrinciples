package com.epam.engx.cleandesign.lod;

public class UserStory {

	String id;
	String assigneeId;

	public UserStory(String storyName) {
		String[] storyDetails = storyName.split(NameFormatter.DELIMITER);
		id = storyDetails[1];
		assigneeId = id;
	}

	public String getEmployeeName(){
		return new Employee(assigneeId).getName();
	}

	public Employee getAssignedEmployee() {
		return new Employee(assigneeId);
	}
}

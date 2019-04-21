package com.epam.engx.cleandesign.lod;

public class Task {

    String name;
    String id;
    String userStoryName;

    public Task(String taskName) {
        String[] taskDetails = taskName.split(NameFormatter.DELIMITER);
        name = taskDetails[0];
        id = taskDetails[1];

        userStoryName = "Story" + NameFormatter.DELIMITER + id;
    }

    public String UserStoryName() {
        return new UserStory(userStoryName).getEmployeeName();
    }

    public UserStory getUserStory() {
        return new UserStory(UserStoryName());
    }
}

package com.java.dsa.queue;

import java.util.Date;

public class ScheduledTask implements Comparable<ScheduledTask>{

	private String taskName;
    private int priority; // Lower number indicates higher priority
    private Date scheduledTime;
    private String description;
    
	public ScheduledTask(String taskName, int priority,  String description) {
		super();
		this.taskName = taskName;
		this.priority = priority;
		this.scheduledTime = new Date();
		this.description = description;
	}
	public ScheduledTask() {
		super();
		
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Date getScheduledTime() {
		return scheduledTime;
	}
	public void setScheduledTime(Date scheduledTime) {
		this.scheduledTime = scheduledTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ScheduledTask [taskName=" + taskName + ", priority=" + priority + ", scheduledTime=" + scheduledTime
				+ ", description=" + description + "]";
	}
	@Override
	public int compareTo(ScheduledTask o) {
		// TODO Auto-generated method stub
		return 0;
	}
    
    
	

}

/**
 * 
 */
package com.sneakylynx.montcogps;

/**
 * @author Tanner
 *
 */
public class Room {
	private int timeStart, timeEnd;
	private String courseName, day, room;
	
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Room(int timeStart, int timeEnd, String courseName, String day,
			String room) {
		super();
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.courseName = courseName;
		this.day = day;
		this.room = room;
	}
	public int getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(int timeStart) {
		this.timeStart = timeStart;
	}
	public int getTimeEnd() {
		return timeEnd;
	}
	public void setTimeEnd(int timeEnd) {
		this.timeEnd = timeEnd;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	@Override
	public String toString() {
		return "Room [timeStart=" + timeStart + ", timeEnd=" + timeEnd
				+ ", courseName=" + courseName + ", day=" + day + ", room="
				+ room + "]";
	}
	
}

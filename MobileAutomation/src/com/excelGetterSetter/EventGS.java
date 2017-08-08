package com.excelGetterSetter;

public class EventGS {
	
	
	private String Eventname;
	private String Event_description;
	private String Event_everyone;
	private String Event_only_Staff;
	private String Event_only_Residents;
	private String Event_Individual;
	private String Select_date;
	private String Update_date;
	private String Start_hour;
	private String Start_minute;
	private String End_hour;
	private String End_minute;
	private String AM_PM;
	
	
	//Set Methods
	
	public void setEventname(String eventname) {
		this.Eventname = eventname;
	}
	
	public void setEvent_description(String event_description) {
		this.Event_description = event_description;
	}
	
	public void setEvent_everyone(String event_everyone) {
		this.Event_everyone = event_everyone;
	}
	
	public void setEvent_only_Residents(String event_only_Residents) {
		this.Event_only_Residents = event_only_Residents;
	}
	
	public void setEvent_only_Staff(String event_only_Staff) {
		this.Event_only_Staff = event_only_Staff;
	}
	
	public void setSelect_date(String select_date) {
		this.Select_date = select_date;
	}
	
	public void setUpdate_date(String update_date) {
		Update_date = update_date;
	}

	
	public void setAM_PM(String aM_PM) {
		AM_PM = aM_PM;
	}
	
	public void setStart_hour(String start_hour) {
		Start_hour = start_hour;
	}
	
	public void setStart_minute(String start_minute) {
		Start_minute = start_minute;
	}
	
	public void setEnd_hour(String end_hour) {
		End_hour = end_hour;
	}
	
	public void setEnd_minute(String end_minute) {
		End_minute = end_minute;
	}
	
	public void setEvent_Individual(String event_Individual) {
		Event_Individual = event_Individual;
	}

	
	//Get Methods
	
	public String getEventname() {
		return Eventname;
	}
		
	public String getEvent_everyone() {
		return Event_everyone;
	}
	
	
	public String getEvent_only_Staff() {
		return Event_only_Staff;
	}
	
	
	public String getEvent_only_Residents() {
		return Event_only_Residents;
	}
	
	public String getEvent_description() {
		return Event_description;
	}

	public String getSelect_date() {
		return Select_date;
	}
	
	public String getUpdate_date() {
		return Update_date;
	}	
	
	public String getAM_PM() {
		return AM_PM;
	}
	
	public String getStart_hour() {
		return Start_hour;
	}
	
	public String getStart_minute() {
		return Start_minute;
	}
	
	public String getEnd_hour() {
		return End_hour;
	}
	
	public String getEnd_minute() {
		return End_minute;
	}
	
	public String getEvent_Individual() {
		return Event_Individual;
	}
}

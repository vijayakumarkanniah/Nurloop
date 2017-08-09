package com.excelGetterSetter;


public class UnassignedGS {
	
private String Selectdate;
private String Hour;
private String Minutes;
private String AM_PM;

//Set Methods



public void setSelectdate(String selectdate) {
	Selectdate = selectdate;
}

public void setHour(String hour) {
	Hour = hour;
}

public void setMinutes(String minutes) {
	Minutes = minutes;
}

public void setAM_PM(String aM_PM) {
	AM_PM = aM_PM;
}

//Get Methods

public String getSelectdate() {
	return Selectdate;
}

public String getHour() {
	return Hour;
}

public String getMinutes() {
	return Minutes;
}

public String getAM_PM() {
	return AM_PM;
}




	


}

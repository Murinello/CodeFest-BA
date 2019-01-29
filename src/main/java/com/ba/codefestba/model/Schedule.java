package com.ba.codefestba.model;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
	
	private List<Day> scheduleDayList=new ArrayList<Day>();

	public Schedule(int year, int firstDay, int LastDay) {
		for(int i=firstDay;i<=LastDay;i++) {
			Day day=new Day(year, i);
			scheduleDayList.add(day);	
		}
	}
	
	public void DisponibilitySchedule(boolean [][] availabilityArray){
		for (int i=0;i<7;i++) {
			int arrayNumberOfDayOfWeek= i+1;
			
			if(availabilityArray[i][0]==false) {
				for(int k=0;k<scheduleDayList.size();k++) {
					int scheduleNumberDayOfWeek= scheduleDayList.get(k).getNumberOfDayOfWeek();
					if (arrayNumberOfDayOfWeek==scheduleNumberDayOfWeek) {
						scheduleDayList.get(k).setMorning(false);
					}
				}
			}
			
			if(availabilityArray[i][1]==false) {
				for(int k=0;k<scheduleDayList.size();k++) {
					int scheduleNumberDayOfWeek= scheduleDayList.get(k).getNumberOfDayOfWeek();
					if (arrayNumberOfDayOfWeek==scheduleNumberDayOfWeek) {
						scheduleDayList.get(k).setEvening(false);
					}
				}
			}	
		}
	}

	public List<Day> getScheduleListDay() {
		return scheduleDayList;
	}
	
}
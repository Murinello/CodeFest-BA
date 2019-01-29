package com.ba.codefestba.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.Table;

public class Availability {

	public static boolean[][] AvailabilityArray() {
		
		boolean[][] availabilityArray = new boolean[7][2];

		availabilityArray[0][0] = false; // Domingo M
		availabilityArray[1][0] = true; // Lunes M
		availabilityArray[2][0] = false; // Martes M
		availabilityArray[3][0] = true; // miercoles M
		availabilityArray[4][0] = false; // jueves M
		availabilityArray[5][0] = true; // viernes M
		availabilityArray[6][0] = false; // sabado M
		availabilityArray[0][1] = false; // Domingo M
		availabilityArray[1][1] = false; // Lunes T
		availabilityArray[2][1] = true; // Martes T
		availabilityArray[3][1] = false; // Miercoles T
		availabilityArray[4][1] = true; // jueves T
		availabilityArray[5][1] = false; // viernes T
		availabilityArray[6][1] = false; // sabado T
		
		return availabilityArray;
	}
	
	public static void setNoAvailabilityDay(Schedule schedule,GregorianCalendar gCDay) {
		int NumberDay = (gCDay.get(Calendar.DAY_OF_YEAR))-1;
		schedule.getScheduleListDay().get(NumberDay).setMorning(false);
		schedule.getScheduleListDay().get(NumberDay).setMorning(false);		
	}
	
	public static GregorianCalendar createDate(int year, int month, int day) {
		GregorianCalendar gCDay= new GregorianCalendar(year,month,day);
		return gCDay;
	}
	
}
package com.ba.codefestba.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Quarter {

	private int firstDay;
	private int lastDay;
	private GregorianCalendar gCDay;

	
	public Quarter (int year,int quarter){
		createDays(year,quarter);
	}
	
	void createDays(int year,int quarter) {
		switch (quarter) {
		case 1:
			firstDay=convertNumberDays(year,0,01); // 01/01
			lastDay =convertNumberDays(year,2,31); // 31/03
			break;
		case 2:
			firstDay=convertNumberDays(year,3,01); // 01/04
			lastDay =convertNumberDays(year,5,30); // 30/06/
			break;
		case 3:
			firstDay=convertNumberDays(year,6,01); // 01/07
			lastDay =convertNumberDays(year,8,30); // 30/09
			break;
		case 4:
			firstDay=convertNumberDays(year,9,01); // 01/10
			lastDay =convertNumberDays(year,11,31); // 31/12
			break;
		default:
			System.out.println("La opción es incorrecta");
			
		}
	}
	
	int convertNumberDays(int year, int month, int day) {
		gCDay=new GregorianCalendar(year, month, day);
		int numberDay=gCDay.get(Calendar.DAY_OF_YEAR);
		return numberDay;
		
	}

	public int getFirstDay() {
		return firstDay;
	}

	public int getLastDay() {
		return lastDay;
	}
	
	
}
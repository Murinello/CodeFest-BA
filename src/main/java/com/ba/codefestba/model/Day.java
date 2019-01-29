package com.ba.codefestba.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Day {

	private GregorianCalendar day;
	private boolean morning;
	private boolean evening;

	public Day(int year, int numberOfDayOfYear) {
		this.day = createDay(year, numberOfDayOfYear);
		morning = true;
		evening = true;
	}
	
	public GregorianCalendar createDay(int year, int numberOfDayOfYear) {
		GregorianCalendar a= new GregorianCalendar();
		a.set(Calendar.YEAR, year);
		a.set(Calendar.DAY_OF_YEAR, numberOfDayOfYear);
		return a;
	}

	public int getNumberOfDayOfWeek() {
		int dayOfWeek = day.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
	}

	public int getNumberOfMonth() {
		int numberOfMonth = day.get(Calendar.MONTH);
		return numberOfMonth;
	}
	public int getNumberOfDayOfMonth() {
		int numberOfdayOfMonth = day.get(Calendar.DAY_OF_MONTH);
		return numberOfdayOfMonth;
	}

	public boolean isMorning() {
		return morning;
	}

	public boolean isEvening() {
		return evening;
	}

	public void setMorning(boolean morning) {
		this.morning = morning;
	}

	public void setEvening(boolean evening) {
		this.evening = evening;
	}
	
}
package com.cts.feb29;

import java.time.LocalDate;

public class TodayDate2 {
public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		int day=date.getDayOfMonth();
		int month=date.getMonthValue();
		int year=date.getYear();
		
		System.out.printf("Year : %d , Month : %d , Day : %d \t %n",year,month,day);

	}

}

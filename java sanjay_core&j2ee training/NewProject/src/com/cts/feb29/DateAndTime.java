package com.cts.feb29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateAndTime {
	public static void main(String[] args) {
		LocalDate local=LocalDate.now();
		System.out.println(local);
		LocalTime time= LocalTime.now();
		System.out.println(time);
		LocalDateTime  date=LocalDateTime.now();
		System.out.println(date);
		
//		Date date = new Date(0);
//		int day = date.getDay();
//		
//		System.out.println(date);
//		switch (day) {
//		case 0:
//			System.out.println("sunday");
//			break;
//		case 1:
//			System.out.println("monday");
//			break;
//		case 2:
//			System.out.println("tuesday");
//			break;
//		case 3:
//			System.out.println("wednesday");
//			break;
//		case 4:
//			System.out.println("thursday");
//			break;
//		case 5:
//			System.out.println("friday");
//			break;
//		case 6:
//			System.out.println("saturday");
//			break;
//
//		default:
//			break;
//		}
//	
	}

}

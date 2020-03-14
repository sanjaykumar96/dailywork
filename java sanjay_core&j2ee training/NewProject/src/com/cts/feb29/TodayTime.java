package com.cts.feb29;

import java.time.LocalTime;

public class TodayTime {
public static void main(String[] args) {
		
		LocalTime current=LocalTime.now();
		
		LocalTime newTime=current.plusHours(2);
		System.out.println("New  time is :"+newTime);
	}
}

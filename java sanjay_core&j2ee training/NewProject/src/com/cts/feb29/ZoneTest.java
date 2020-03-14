package com.cts.feb29;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneTest {
	public static void main(String[] args) {
		ZoneId zoneId=ZoneId.of("Asia/Calcutta");
		
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println("Date and Time :"+localDateTime);
		ZonedDateTime zonedDateTime=ZonedDateTime.of(localDateTime, zoneId);
		System.out.println("Date and Time in delhi :"+zonedDateTime);
	}
}
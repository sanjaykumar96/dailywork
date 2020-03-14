package com.cts.feb29;

import java.time.LocalDate;
import java.time.MonthDay;

public class RecurringEvents {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		LocalDate birthday=LocalDate.of(1985, 8, 18);
		MonthDay birth=MonthDay.of(birthday.getMonthValue(), birthday.getDayOfMonth());
		MonthDay current=MonthDay.from(today);
		if(birth.equals(current))
		{
			System.out.printf("Today %s and birthday %s are same dates %n",today,birthday);
		}
		else
		{
			System.out.println("Dates are not Equal");
		}
	}
}

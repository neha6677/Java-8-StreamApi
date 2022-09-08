package com.stream.itemdetails;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ItemDetailsDemo  {

	public static void main(String[] args) {
		try {
		String startDate = "2020/10/21";
		String endDate = "2028/10/27";
		List<Item> list = new ArrayList<>();
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDateTime start = LocalDate.parse("20200418", formatter).atStartOfDay();
		LocalDateTime end = LocalDate.parse("20200212", formatter).atStartOfDay();
		
		//System.out.println(start.getYear());

		Item i1 =new Item(1,"chair",start,end,23222);
		Item i2 =new Item(2,"bed",start,end,27544);
		Item i3 =new Item(3,"Almirah",start,end,23333);
		
		float price = i1.getPrice()+i2.getPrice()+i3.getPrice();
		float avg=price/3;
		System.out.println("Average of item is "+ avg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

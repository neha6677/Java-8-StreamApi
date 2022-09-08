package com.stream.itemdetails;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PrintHighestAndLowestPrice {

	public static void main(String[] args) {
		
		try {
			String startDate = "2020/10/21";
			String endDate = "2028/10/27";
			List<Item> list = new ArrayList<>();
			final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
			LocalDateTime start = LocalDate.parse("20200418", formatter).atStartOfDay();
			LocalDateTime end = LocalDate.parse("20200212", formatter).atStartOfDay();
			

			Item i1 =new Item(1,"Choalate shake",start,end,1500);
			Item i2 =new Item(2,"Samsung-galaxy s9",start,end,27544);
			Item i3 =new Item(3,"Television",start,end,20000);
			Item i4 =new Item(4,"Butter-milk",start,end,3600);
			Item i5 =new Item(5,"Laptop",start,end,60000);
			
			Comparator<Item> comparator = Comparator.comparing( Item::getPrice );
			
			list.add(i1);
			list.add(i2);
			list.add(i3);
			list.add(i4);
			list.add(i5);
			
			
			Item lowest = list.stream().min(comparator).get();
			Item highest = list.stream().max(comparator).get();
			
			System.out.println("Item Details for highest price is "+highest);
			System.out.println("_______________________");
			System.out.println("Item Details for lowest price is "+lowest);
			
			
		}
			catch(Exception e) {
				e.printStackTrace();
			}

	}

		// TODO Auto-generated method stub

	

}

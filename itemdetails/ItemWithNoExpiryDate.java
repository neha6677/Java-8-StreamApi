package com.stream.itemdetails;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ItemWithNoExpiryDate {

	public static void main(String[] args) {
		
		try {
			String startDate = "2020/10/21";
			List<Item> list = new ArrayList<>();
			
			final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
			LocalDateTime start = LocalDate.parse("20200418", formatter).atStartOfDay();
			

			Item i1 =new Item(1,"water bottle",start,1500);
			Item i2 =new Item(2,"dress",start,7544);
			Item i3 =new Item(3,"Pen",start,400);
			Item i4 =new Item(4,"Pencil-Box",start,800);
			Item i5 =new Item(5,"Shoes",start,6000);
			
			
			Comparator<Item> comparator = Comparator.comparing( Item::getPrice );
			
			list.add(i1);
			list.add(i2);
			list.add(i3);
			list.add(i4);
			list.add(i5);
			
			
		
			Item highest = list.stream().max(comparator).get();
			
			System.out.println("Item Details for highest price with no expiry date "+highest);
			
			
		}
			catch(Exception e) {
				e.printStackTrace();
			}



	}

}

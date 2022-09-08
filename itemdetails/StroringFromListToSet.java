package com.stream.itemdetails;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StroringFromListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		
			List<Item> list = new ArrayList<>();
			
			final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
			LocalDateTime start = LocalDate.parse("20200418", formatter).atStartOfDay();
			LocalDateTime end = LocalDate.parse("20200212", formatter).atStartOfDay();
			

			Item i1 =new Item(1,"Choalate shake",start,end,1500);
			Item i2 =new Item(2,"Samsung-galaxy s9",start,end,27544);
			Item i3 =new Item(3,"Television",start,end,20000);
			Item i4 =new Item(4,"Butter-milk",start,end,3600);
			Item i5 =new Item(5,"Laptop",start,end,60000);
			//Item i6 =new Item(5,"Laptop",start,end,7654);
			
			
			
			list.add(i1);
			list.add(i2);
			list.add(i3);
			list.add(i4);
			list.add(i5);
			//list.add(i6);
			System.out.println(list);
			
			Set<Item> set = new HashSet<>();
			//set=list.stream().collect(Collectors.toSet());
			//System.out.println(set);
			
			System.out.println("............");
			Set<String> set1 = list.stream().map(item -> item.getIname()+"---"+item.getPrice()).collect(Collectors.toSet());
			
			for (String value : set1) {
		      System.out.print(value + ", "); 
		      System.out.println();}
			//Also duplicates removed
			System.out.println("_____________________________________________________________________________________");
			System.out.println(set1);
	    
			
		}
			catch(Exception e) {
				e.printStackTrace();
			}


	}

}

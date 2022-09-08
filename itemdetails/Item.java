package com.stream.itemdetails;

import java.time.LocalDateTime;

public class Item {
	int itemid; 
	String iname; 
	LocalDateTime date_of_manufacturing, date_of_expiry;
	float price;
	public Item(int itemid, String iname, LocalDateTime date_of_manufacturing, LocalDateTime date_of_expiry,
			float price) {
		super();
		this.itemid = itemid;
		this.iname = iname;
		this.date_of_manufacturing = date_of_manufacturing;
		this.date_of_expiry = date_of_expiry;
		this.price = price;
	}
	
	
	public Item(int itemid, String iname, LocalDateTime date_of_manufacturing, float price) {
		super();
		this.itemid = itemid;
		this.iname = iname;
		this.date_of_manufacturing = date_of_manufacturing;
		this.price = price;
	}


	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public LocalDateTime getDate_of_manufacturing() {
		return date_of_manufacturing;
	}
	public void setDate_of_manufacturing(LocalDateTime date_of_manufacturing) {
		this.date_of_manufacturing = date_of_manufacturing;
	}
	public LocalDateTime getDate_of_expiry() {
		return date_of_expiry;
	}
	public void setDate_of_expiry(LocalDateTime date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", iname=" + iname + ", date_of_manufacturing=" + date_of_manufacturing
				+ ", date_of_expiry=" + date_of_expiry + ", price=" + price + "]";
	}
	
	
	
	


}

package io.pello.cleancode.samples.solid.srp.bad;

public class Item {
	private int code;
	private double price;
	private int qty;
	private String name;
	
	public Item(int code, double price, int qty, String name) {
		super();
		this.code = code;
		this.price = price;
		this.qty = qty;
		this.name = name;
	}
	
	public double getTotalPrice () {
		return price * qty;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Item [code=" + code + ", price=" + price + ", qty=" + qty + ", name=" + name + "]";
	}
	
	
	
}

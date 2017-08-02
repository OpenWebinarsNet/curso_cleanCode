package io.pello.cleancode.samples.solid.srp.bad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Order {
	private Long id;
	private String customer;
	private ArrayList<Item> items = new ArrayList<Item>(); 
	private String address;
	private String preferences;
	private String status = "CREATED";
	
	public Order () {
		
	}
	
	public Order (String filename) {
		loadFromFile(filename);
	}
	
	public Order(Long id, String customer, ArrayList<Item> items, String address, String preferences) {
		this.id = id;
		this.customer = customer;
		this.items = items;
		this.address = address;
		this.preferences = preferences;
	}

	public void loadFromFile (String filename) {
		BufferedReader bufferedReader = null;;
		try {
			bufferedReader = new BufferedReader(new FileReader(filename));
			String line = "";
			line = bufferedReader.readLine();
			
			String data[] = line.split(";");
			id = Long.parseLong(data[0]);
			customer = data[1];
			address = data[2];
			preferences = data[3];
			
			while ((line = bufferedReader.readLine()) != null) {
				data = line.split(";");
				Item item = new Item(Integer.parseInt(data[0]),
									 Double.parseDouble(data[1]),
									 Integer.parseInt(data[2]),
									 data[3]);
				items.add(item);
			}	
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 		
	}
	
	public void saveIntoFile (String filename) {
		BufferedWriter bufferedWriter = null;;
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(filename));

			bufferedWriter.append(id+";"+customer+";"+address+";"+preferences);

			for (Item item: items) {
				bufferedWriter.append(item.getCode()+";"+item.getPrice()+";"+item.getQty()+";"+item.getName());
			}
			
			bufferedWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 		
	}
	
	public double calculateTotal () {
		double total = 0;
		for (Item item: items) {
			total = total + item.getTotalPrice();
		}
		return total;
	}
	
	public String printPackageAddress () {
		String packageAddress = "";
		
		packageAddress = customer + "\n"; 
		packageAddress = packageAddress + address + "\n";
		packageAddress = "(" + preferences + ")\n";
		
		return packageAddress;
	}

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPreferences() {
		return preferences;
	}



	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", items=" + items + ", address=" + address
				+ ", preferences=" + preferences + ", status=" + status + "]";
	}

}

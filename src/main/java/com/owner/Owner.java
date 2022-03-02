package com.owner;

public class Owner {
	int owner_id;
	String name;
	String address;
	
	public Owner(int owner_id, String name, String address) {
		super();
		this.owner_id = owner_id;
		this.name = name;
		this.address = address;
	}
	
	public int getOwner_id() {
		return owner_id;
	}
	
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Owner [owner_id=" + owner_id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}

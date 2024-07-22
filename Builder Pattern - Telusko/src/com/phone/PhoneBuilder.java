package com.phone;

public class PhoneBuilder {
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	
	//type converted from void to PhoneBuilder
	//this helps in setting the value as per user's choice!
	//if user doesn't want to assign any value then they will not and it'll not create problem...
	
	/*public void setOs(String os) {
		this.os = os;
	}*/
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone()
	{
		return new Phone(os, ram, processor, screenSize, battery);
	}
}

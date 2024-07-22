package com.phone;

public class OperatingSystemFactory {
	
	public OS getInstance(String str) {
		
		//this class creates the object based on the input and its hidden from user
		if(str.equals("open"))
			return new Android();
		else if(str.equals("closed"))
			return new IOS();
		return new Windows();
		
	}
}

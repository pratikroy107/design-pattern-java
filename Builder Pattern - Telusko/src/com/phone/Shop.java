package com.phone;

public class Shop
{
	public static void main(String[] args)
	{
		Phone p = new PhoneBuilder().setOs("android").setRam(2).getPhone();
		System.out.println(p);
		//since we aren't taking values of proc,scrnsyz,battery... so they'll be 0 and null.
		//also sequence doesn't matter!!
	}
}

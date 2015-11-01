package com.datta.hrm.controllers;

public class Test {

	public static void main(String[] args) {
		String a = "abc";
		String d = "abc";
		String b = new String("abc").intern();
		String c = new String("abc").intern();
	    b = c.intern();
	    b.intern();
		
		if(a == b)
		{
			System.out.println("a=b");
		}
		if(c == b)
		{
			System.out.println("c = b");
		}
		if(a == d)
		{
			System.out.println("a = d");
		}

	}

}

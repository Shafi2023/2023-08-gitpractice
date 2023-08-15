package com.pratice.get;

public class helloWorld {
	
	public static void main(String[] args) {
		System.out.println("hello world");
		helloWorld obj = new helloWorld();
		int c = obj.Add();
		System.out.println(c);
		
	}

	public int Add() {
		
		int a = 5;
		int b = 10;
		int c = a+b;
		return c;
		
		
	}
}

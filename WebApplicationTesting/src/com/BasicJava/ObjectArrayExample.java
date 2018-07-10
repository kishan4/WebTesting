package com.BasicJava;

public class ObjectArrayExample {

	public static void main(String[] args)
	{
		
		Object  a[]= new Object[5];
		a[0]=23;
		a[1]= "KISHAN";
		a[2]= 123.25;
		a[3]= 142.35f;
		
		for(Object Var:a)
		{
			System.out.println(Var);
		}
			
		
		
	}

}

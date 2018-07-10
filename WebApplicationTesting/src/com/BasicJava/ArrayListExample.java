package com.BasicJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		
		
			List<String> a  = new ArrayList<>();
			a.add("KISHAN"); //a[0]
			a.add("LOADMETER");//a[1]
			a.add("SELENIUM");  //a[2]
			a.add("APPIUM");	//a[3]
			a.add("CUCUMBER");	//a[4]
			a.add("APPLE");		//a[5]
			
			
			for(int i=0;i<a.size();i++) //123456
										//0<6,1<6,2<6,3<6,4<6,5<6//
			{
				System.out.println(a.get(i));
			}
	}

}

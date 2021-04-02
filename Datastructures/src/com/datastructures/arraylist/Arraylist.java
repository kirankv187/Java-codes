package com.datastructures.arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist 
{
 public static void main(String[] args) 
 {
	ArrayList list = new ArrayList();
	list.add(10);
	list.add(20.5);
	list.add("SQL");
	list.add(null);
	list.add(null);
	
	Object obj = list.get(0);
	Integer i1 = (Integer) obj;
	System.out.println(i1);
	
	Object obj1 = list.get(1);
	Double i2 = (Double) obj1;
	System.out.println(i2);
	
	Object obj3 = list.get(2);
	String i3 = (String) obj3;
	System.out.println(i3);
	
	System.out.println("--------------");
	
	for (int i = 0; i < list.size(); i++) 
	{
		Object obj4 = list.get(i);
		System.out.println(obj4);
	}
}
}

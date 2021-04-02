package com.datastructures.arraylist;

import java.util.ArrayList;

public class Mainclass 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(101,"XYZ",90.0);
		Student s2 = new Student(201,"Ramesh",50.0);
		Student s3 = new Student(301,"Suresh",60.0);
		
		ArrayList list = new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for (int i = 0; i < list.size(); i++) 
		{
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}
	
}

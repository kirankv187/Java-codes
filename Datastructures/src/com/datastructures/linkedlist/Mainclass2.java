package com.datastructures.linkedlist;

import java.util.LinkedList;
public class Mainclass2 
{

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add("java");
		list.add(100);
		list.add('H');
		list.add(20.5);
		list.add("sql");
		list.add('d');
		list.add(2,"spring");
		list.get(0);
		list.removeLast();
		
		Object firstelement= list.getFirst();
		Object lastelement = list.getLast();
		Object element = list.get(3);
		 
		System.out.println(firstelement);
		System.out.println(lastelement);
		System.out.println(element);
		System.out.println(list);
	
	}

}

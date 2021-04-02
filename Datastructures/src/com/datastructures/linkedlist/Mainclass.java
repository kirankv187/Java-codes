package com.datastructures.linkedlist;

public class Mainclass 
{
	public static void main(String[] args) 
	{
		Linkedlist list = new Linkedlist(19);
		list.insert(20,1);
		list.insert(30,2);
		list.insert(40,4);
		list.traversalLinkedList();
		list.search(20);
		//list.delete(2 );
		list.delete(3);
	}

}

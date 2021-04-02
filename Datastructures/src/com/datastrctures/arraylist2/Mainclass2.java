package com.datastrctures.arraylist2;

import java.util.Vector;

public class Mainclass2 {

	public static void main(String[] args)
	{
		Vector vector = new Vector();
		
		for (int i = 0; i < 10; i++) 
		{
			vector.add(i);
		}
		
		for (int i = vector.size()-1; i>=0  ; i--)
		{
			System.out.print(" "+vector.get(i));
		}
	}

}

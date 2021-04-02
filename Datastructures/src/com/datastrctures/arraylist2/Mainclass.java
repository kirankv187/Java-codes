package com.datastrctures.arraylist2;

import java.util.ArrayList;

public class Mainclass {

	public static void main(String[] args) 
	{
		ArrayList list =new ArrayList();
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		for(int i=list.size()-1;i>=0;i--)
		{
			Object obj=list.get(i);
			Integer value =(Integer ) obj;
			if(value%2!=0) 
			{
		list.remove(i);
		System.out.println(i);
		 
			}
			//System.out.print(value);
		
		}
		}
}

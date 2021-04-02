/*
Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.

Input: arr[]={0,0,1,0,3,0,5,0,6 };
Output: arr[]={1,3,5,6,0,0,0,0,0};
*/

public class Zeros 
{
	public static void zero(int arr[])
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(" "+arr[i]);
		}
	}
	public static void main(String[] args) 
	{
		int arr[]={0,0,1,0,3,0,5,0,6 };
		zero(arr);
	}

}

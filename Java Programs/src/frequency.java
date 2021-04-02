import java.util.Iterator;

/*
Program to find the frequency of each element in the array.
Input 1: a[]= {2,3,4,3,2,3,4,2} 
Output : Frequency of 2 is 3
                 Frequency of 3 is 3
	      Frequency of 4 is 2
	      */

public class frequency 
{
	public static void test(int arr[])
	{
		int count=0, f=arr[0],temp=0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 1+i; j < arr.length; j++) 
			{
				if(arr[i]==arr[j])
				{
					count++;
				}	
			}
			System.out.println(arr[i]+" "+count);
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {2,3,4,3,2,3,4,2};
		test(arr);

	}

}

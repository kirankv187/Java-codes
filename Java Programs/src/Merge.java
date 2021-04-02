/*
Given two arrays, the task is to merge or concatenate them and store the result into another array
without using pre defined functions.
input: arr[] = {1,3,4,5}, arr2[]= {2,4,6,8};
op: arr3[] = {1,3,4,5,2,4,6,8}.


*/
public class Merge 
{
	public static void merge(int arr1[], int arr2[])
	{
		int l1=arr1.length;
		int l2=arr2.length;
		int res[]=new int[l1+l2];
		int count=0;
		for (int i = 0; i < arr1.length; i++) 
		{
			res[i]=arr1[i];
		}
		
		for (int i = l1; i < res.length; i++) 
		{
			res[i]=arr2[count];
			count++;
		}
		for (int i = 0; i < res.length; i++) 
		{
			System.out.print(" "+res[i]);
		}
	}

	public static void main(String[] args) 
	{

		int arr1[]= {1,3,4,5};
		int arr2[]= {2,4,6,8};
		merge(arr1,arr2);
	}

}

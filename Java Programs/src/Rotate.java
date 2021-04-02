/*
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
*/
public class Rotate 
{
	public static void test(int arr[],int num)
	{
		int len=arr.length-num;
		int res[]=new int[arr.length];
		int temp[] = new int[num];
		int count=0,c2=0;
		for (int i = 0; i < temp.length; i++) 
		{
			temp[i]=arr[i];
		}
		for (int i = num; i < res.length; i++) 
		{
			res[count]=arr[i];
			count++;
		}
		for (int i = len; i < res.length; i++) 
		{
			res[i]=temp[c2];
			c2++;
		}
		for (int i = 0; i < res.length; i++) 
		{
			System.out.print(" "+res[i]);
		}
		
		
	}
	public static void main(String[] args) 
	{
	int arr[]= {1,2,3,4,5,6,7,8,9};
	test(arr,4);

	}

}

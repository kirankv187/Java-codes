/*
 
Given an array of numbers and one unique number find the combination of the 
 numbers whose sum is equal to the given unique number. 
Ex: Input : {0,1,2,7,3,4,5} unique number = 5 
Output: 0,5
      	1, 4 
 		2, 3
 */
public class Sum 
{
	public static void comb(int arr[], int unq)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]+arr[j]==unq)
				{
					System.out.println(i+","+j);
				}
			}
		}
	
		
	}
	public static void main(String[] args) 
	{
		//int arr[]= {0,1,2,7,3,4,5};
		//comb(arr);
		int arr2[]={2,1,2,7,3,4,5};
		comb(arr2,5);
	}

}

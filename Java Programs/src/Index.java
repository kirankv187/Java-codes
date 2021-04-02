//Input: 10 11 15 48 20 148 5 45 48 30 
// index : 0 1 6 7 8
//output : 48
public class Index 
{

	public static void main(String[] args) 
	{
		int arr[] = new int[] {10,11, 15, 48, 20, 148, 5, 45, 48, 30};
		int res[] = new int[arr.length];
		int size = arr.length;
		int sum=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(i==0 || i==1 || i==6 || i==7 || i==8)
			{
				res[i] =arr[i];
			}
		}
		int temp=0;
		for (int i = 0; i <= res.length; i++) 
		{
			for (int j = i+1; j < res.length; j++) 
			{
				if(res[i]>res[j])
				{
					temp=res[i];
					res[i]=res[j];
					res[j]=temp;
				}
			}
		}
		System.out.println(temp);
		
		
	}

}

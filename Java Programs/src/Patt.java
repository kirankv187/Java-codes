
public class Patt 
{
	public static void print(int arr[][])
	{
		int var=1;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				System.out.print(" "+var);
				var++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int arr[][]= { {1,1,1,1},
				       {1,1,1,1},
				       {1,1,1,1},
				       {1,1,1,1}};
		print(arr);	
	}
}

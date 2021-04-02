
public class Diagonal 
{
	public static void output(int res[][],int size)
	{
		int k1=0, k2=size-1;
		for(int i=0; i<res.length;i++)
		{
			for(int j=i; j<res.length;j++)
			{
				if((i==j && j==i) || (i==k2))
				{
					System.out.print(" " +res[i][j]);
					k2--;
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
	} 
	public static void main(String[] args) 
	{
		 int size=5;
		System.out.println("Enter size of the array:"+size);
		int a[][]={ {1,2,3,4,5},
					{6,7,8,9,10},
					{11,12,13,14,15},
					{16,17,18,19,20},
					{21,22,23,24,25}};
		output(a,size);
	}

}

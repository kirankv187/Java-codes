
public class Mainclass {

	public static void main(String[] args) 
	{
		/*int k[]= {1,2,3,4,5};
		
		for(int a : k)
		{
			System.out.println(a);
		}
		*/
		int d[][]= {	{1,2,3,4,5},
						{9,8,7,6,5},
						{2,5,8,7,4}
						};
		for(int k[] : d)
		{
			for(int a : k)
			{
				System.out.print(" "+a);
			}
			System.out.println();
		}
	}

}


public class wordcount {

	public static void main(String[] args) 
	{
		String str="  Get the string to count the total";
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i)==' ')
			{
				i++;
			}
			else if(str.charAt(i)==0)
			{
				System.out.println();
			}
		}
		
		

	}

}

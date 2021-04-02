/*
WAP that takes String as input and print a pattern as shown below 
Ex: Input : sending 
Output: 
s
se
sen
send
sendi
sendin
sending
ending
nding
ding
ing
ng
g
*/
public class Pattern 
{
	public static void print(String str)
	{
		for (int i = 0; i < str.length(); i++) 
		{
			for (int j = 0; j < i; j++) 
			{
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		for (int i = 0; i < str.length(); i++) 
		{
			for (int j = i; j < str.length(); j++) 
			{
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args)
	{
		String str="sending";
		print(str);
	}

}

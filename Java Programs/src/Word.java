
public class Word 
{
	public static void count(String str)
	{
		int count=0;
		char ch[]=new char[str.length()];
		for (int i = 0; i < ch.length; i++) 
		{
			ch[i]=str.charAt(i);
			if(((i>0) && (ch[i]!=' ') && (ch[i-1]==' ')) || ((ch[0]!=' ') && (i==0)))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args)
	{
	String str="How many rggs are in a half-dozen, 13";
	count(str);

	}

}

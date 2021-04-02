public class Vowelcount {

	public static void main(String[] args) 
	{
		String str="This is a really simple sentence";
		int len=str.length();
		System.out.println(len);
		str=str.toLowerCase();
		System.out.println(str);
		int constant=0;
		int vowel=0;
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i)==' ')
			{
				//i++;
			}
			else if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				vowel++;
			}
			else
			{
				constant++;
			}
		}
		System.out.println("vowel "+vowel);
		System.out.println("contsant" +constant);
	}

}

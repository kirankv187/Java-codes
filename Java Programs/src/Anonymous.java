
class AB
{
	public void show() 
	{
		System.out.println("in a show");
	}
}
public class Anonymous {

	public static void main(String[] args) 
	{
		AB obj = new AB()
		{
			public void show()
			{
				System.out.println("im the best");
			}
		};
		
		obj.show();
	}

}

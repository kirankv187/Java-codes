
public class Tostring 
{
	int id;
	String name;
	String branch;
	
	public Tostring(int id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	
	@Override
	public String toString() 
	{
		return "Tostring [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}

	public static void main(String[] args) 
	{
		Tostring st1= new Tostring(12,"kiran","Tce");
		Tostring st2= new Tostring(123,"XYZ","ECE");
		
		System.out.println(st1);
		System.out.println(st2);
	}

}

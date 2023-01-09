package tryncatch;

public class demo
{
	public static void main(String []args)
	{
	System.out.println("main starts");
	try
	{
		int i=2/0;
		
	}
	
catch(Exception e)
	{
	System.out.println("handled");
	}
	}

}

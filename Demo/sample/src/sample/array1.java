package sample;

public class array1
{
public static void main(String[] args)
{
	int[] arr={10,25,15,40,60};
	int smallest=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<smallest)
		{
			smallest=arr[i];
		}
			
	}
	System.out.println(smallest);
}
}

package Oops;

public class HelloWorld {

	public static void main(String[] args)
	{
		int x[]={1,2,3,4,5};
		System.out.println("NewBeginnings");
		System.out.println(x[3]);
		Arrays obj=new Arrays();
		obj.DeleteFromArray(x, 3);
		System.out.println(x[3]);
	}
	
}

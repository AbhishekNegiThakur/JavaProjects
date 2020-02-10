package Oops;

public class Arrays {
	
	public static void main(String[] args)
	{
		
		int x[]={1,2,3,4,5};
		System.out.println(x.length);
		System.out.println(x[3]);
		Arrays obj=new Arrays();
		x=obj.DeleteFromArray(x, 3);
		System.out.println(x[3]);
	
	}
	
	public int[] DeleteFromArray(int []x,int Position)
	{
		for(int i=0;i<x.length;i++)
		{
			if(i==Position)
			{
			   for(int j=i+1;j<x.length;j++){
				   x[i]=x[j];
				   i++;
			   }
			}
		}
		
		return x;
	}

}

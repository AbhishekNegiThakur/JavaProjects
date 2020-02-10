package Oops;

public class Bike extends JAbstract{

	 public void Run()
	 {
		 System.out.println("Here we Go");
	 }
	 
	 public void Run2()
	 {
		 System.out.println("Here we Go again");
	 }
	 
	 public static void main(String[] args){
		 
		 JAbstract obj=new Bike();
		 Bike obj2=new Bike();
		 obj.Run();
		 obj2.Run2();
	 }
}

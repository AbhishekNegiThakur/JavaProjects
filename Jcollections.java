package Oops;

public class Jcollections {
	String text;
	
	public void setText(String t){
		
		this.text=t;
	}
	public String getText(){
		return text;
	}
	public static void main(String args[]) 
	{
		Jcollections j=new Jcollections();
		j.setText("Yep!");
		System.out.println(j.getText());
		NStrings n=new NStrings();
		n.print(j);
		System.out.println(j.getText());
	}
}

package sampl1;
class singl{
	public void hexa()
	{
		System.out.println("Pringin the variable");
		//return 0;

	}
}
class doubledata extends singl
{
	public void hexa()
	{
		//int c = a+a;
	System.out.println("hello world");

	}
}
public class Override {
	public static void main(String args[])
	{
		doubledata dd= new doubledata();
		singl ss= new singl();
		ss.hexa();
		dd.hexa();
		
	}
}

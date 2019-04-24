package sampl1;

public class ExtendingandImplementing {
	public static void main(String args[])
	{

		car c=new color();
		c.car();
		car nc = new newcolor();
		nc.car();
	}
}
interface car{

	public String car();
	public static void a()
	{
		System.out.println("test");
	}
}
class color implements car {
	public String car(){
		String colour= "Color of car is";
		System.out.println(colour+"red");
		return colour;
	}}
class newcolor extends color{
	public String car() {
		String colour="The shade of car";
		System.out.println(colour+"blue");
		return colour;

	}
}
abstract class sample1 {
public void table() {
	String dono = "sample program";
	System.out.println(dono);
}
abstract void tableone();
}


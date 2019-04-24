package sampl1;

abstract class signature{

	abstract void east();
	public void direction()
	{
		System.out.println("Printing all the direction");
	}

}
class sign extends signature{

	void east(){

		System.out.println("The direction printed is east");
	}
	public void direction()
	{
		System.out.println("The is a overridding method");
	}
}

public class SampleAbstraction {
	public static void main(String args[])
	{
		sign sg= new sign();
		sg.east();
		sg.direction();

	}
}

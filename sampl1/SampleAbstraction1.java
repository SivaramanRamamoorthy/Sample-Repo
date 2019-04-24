package sampl1;

abstract  class  animal{
	abstract void type();

	public void  geography() {
		System.out.println("The animals are in amazon");
	}
}
class hunting extends animal{
	void type() {
		System.out.println("This is lion");
	}
}
public class SampleAbstraction1
{
	public static void main(String args[]) {
		hunting hi= new hunting();
		hi.type();
	}	
}
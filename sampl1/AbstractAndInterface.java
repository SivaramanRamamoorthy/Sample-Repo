package sampl1;

public class AbstractAndInterface {
public static void main(String args[])
{
codetwo cdt= new finalcoding();
finalcoding fc= new finalcoding();
cdt.wiritingInterfaceCode();
}
}
interface codetwo {
abstract void wiritingInterfaceCode();
public static void building() {
	System.out.println("Printing the building methods");
}
}

abstract class codeone implements codetwo 
{
	abstract void writingCode();
	public void printingCode() {
		System.out.println("Printing the code");
	}
	public static void building()
	{
		System.out.println("Printing the new building methods");
	}
	void writingInterfaceCode()
	{
		System.out.println("Wiriting writingInterfacCode");
	}
}

 class finalcoding extends codeone{
	public void drawtable() {
		System.out.println("Printing the drawtable");
	}
	void writingCode() {
		System.out.println("Writing the code");
	}
	 public void wiritingInterfaceCode() {
		System.out.println("Writing the WritingInterfaceCode");
	}
}
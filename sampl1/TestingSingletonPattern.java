package sampl1;

public class TestingSingletonPattern {
	static String name ;
private TestingSingletonPattern() {
	
	}
public void display(String empname) {
	name=empname;
	System.out.println("Printing the empname" + empname);

	}
public static void main(String args[])
{
	TestingSingletonPattern s1= new TestingSingletonPattern();
s1.display("Dinesh");
TestingSingletonPattern s2= new TestingSingletonPattern();


}
}

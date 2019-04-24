package sampl1;

class sampleload{
	
	public int method1(int a, int b) {
		int c = a+b;
		return c;
	}
	public int method1(int a, int b, int c)
	{
		int d= a*b*c;
		return d;
	}
}
public class Overload extends sampleload {
public static void main(String args[])
{
sampleload s1= new sampleload();
System.out.println(s1.method1(5,5));
int value = s1.method1(5, 10, 15);
System.out.println(value);
	}
}

package sampl1;

public class TryCatchSample1 {
public static void main (String args[])
{
int a=25;
try {
int c= 25/0;
System.out.println(c);
}
catch(Exception e)
{
	e.printStackTrace();
	throw new ArithmeticException("Invalid calculation"); 
	}
}

}
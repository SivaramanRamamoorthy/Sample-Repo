package sampl1;

public class EqualsandEqualsmethods {
	public static void main(String args[])
	{
		String s1= "ram";
		String s2="ram";
		if(s1.equals(s2))
		{
			System.out.println("The state of object is compared");
		}
		else if(s1==s2)
		{
			System.out.println("The memory location of the object is compared");
		}
	}
}

package sampl1;

public class StringReplaceSampleProgram {
public static void main(String args[])

{
	String str= "{ShahRukhKhan}";
	String replacedstring= str.replace("{", " ");
	String fullylreplacedstring= replacedstring.replace("}", " ");
	System.out.println(fullylreplacedstring);
	}
}

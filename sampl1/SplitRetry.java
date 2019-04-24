package sampl1;

public class SplitRetry {
public static void main(String args[])
{
String splittry = "sivaraman ramamoorthy";
String[]sample =splittry.substring(splittry.indexOf("s")+1,splittry.lastIndexOf("n")).split("");
for(String test : sample)
{
	
System.out.print(test);}
}
}

package sampl1;

class days{
String noofdays="seven";

}

class month extends days{
String noofdays="six";	
	
void methodtoprint() {
	System.out.println(noofdays);
	System.out.println(super.noofdays);
}}
public class SuperKeyword {
public static void main(String args[])
{
month m1= new month();
m1.methodtoprint();
}
}

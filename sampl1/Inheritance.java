package sampl1;	
class sampleone{
public void a()
{
	System.out.println("Printing void a");
}
}
class sampletwo extends sampleone{
public void b(){
	System.out.println("Printing void b");
}	
}
public class Inheritance {
public static void main(String args[])
{
sampleone  s= new sampleone();
s.a();
sampletwo s2= new sampletwo();
s2.a();
s2.b();
}
}

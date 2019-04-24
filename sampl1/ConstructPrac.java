package sampl1;

public class ConstructPrac {
	int i;
	String name;
	
ConstructPrac(int id, String fullname){
	id=i;
	fullname=name;
}
void display() {System.out.println("The id is :" + i+":"+name);}
public static void main(String args[])
{
ConstructPrac prac= new ConstructPrac(10,"sivaraman");
prac.display();

}
}

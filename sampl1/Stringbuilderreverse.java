package sampl1;

public class Stringbuilderreverse {
public static void main(String args[])
{
	Stringbuilderreverse sptc=new Stringbuilderreverse();
	sptc.reverse("siva");
}

public void reverse(String name)
{
StringBuilder sbt= new StringBuilder(name);

String reversable =sbt.reverse().toString();
System.out.println(reversable);
}
}

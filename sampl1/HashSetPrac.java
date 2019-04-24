package sampl1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPrac {
public static void main(String args[])
{
    HashSet<String> set= new HashSet<String>();
    set.add("Ram");
    set.add("ram");
    set.add("Lakshman");
    Iterator <String> i= set.iterator();
    while(i.hasNext()) {
    	
    	System.out.println(i.next());
    }
	
		
	}
}

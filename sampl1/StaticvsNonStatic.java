package sampl1;

public class StaticvsNonStatic {
	static String tempo;
	public static void main(String args[]) {
		int bc=12;
		StaticvsNonStatic sns = new StaticvsNonStatic();
		sns.static1();
		StaticvsNonStatic.static2();
	}

	void static1() {
		int a=10;	
		tempo = "string123";
		System.out.println("Prnting non static methods");	
	}
	static void static2() {
		tempo ="string12333";
		System.out.println("Printing static methods");
	}
}

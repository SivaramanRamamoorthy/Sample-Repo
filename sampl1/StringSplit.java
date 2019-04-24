package sampl1;

public class StringSplit {
	public static void main(String args[])
	{
		String srt= "[Sivaraman Ramamoorthy]";
		String[] split =srt.substring(srt.indexOf("[")+1,srt.indexOf("]")).split(" ",2);
		//System.out.print(split);

		for(String s: split) {
			System.out.println(s);

		}

	}
}

package sampl1;

public class StringCharAtAndLength {
	public static void main(String args[])
	{
		String srt= "sivaramana";
		int count = 0;
		for(int i=0;i<srt.length();i++) {
			if(srt.charAt(i)=='a')
			{
				count++;
			}
		}
		System.out.println("count "+ count );
	}
}

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		char lastletter='?';
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==lastletter) {
				count++;
			}
			lastletter=str.charAt(i);
		}
		return count;
	}
}
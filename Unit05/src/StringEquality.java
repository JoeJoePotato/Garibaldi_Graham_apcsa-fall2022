import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
	}

	public StringEquality(String one, String two)
	{
		wordOne=one;
		wordTwo=two;
	}

	public void setWords(String one, String two)
	{
		wordOne=one;
		wordTwo=two;
	}

	public boolean checkEquality( )
	{
		if(wordOne.equals(wordTwo)) {
			return true;
		}
		return false;
	}

	public String toString()
	{
		if(checkEquality()==false) {
		return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
		return wordOne + " does have the same letters as " + wordTwo + "\n";
		}
}
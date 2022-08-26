
import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}

	//add in second constructor
	public LetterRemover(String s, char rem) {
		sentence=s;
		lookFor=rem;
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int i=0;
		while(i<cleaned.length()) {
		if(cleaned.charAt(i)==lookFor) {
			String before="";
			if(i>0) {
				before=cleaned.substring(0, i);
			}
			String after=cleaned.substring(i+1);
			cleaned=before+after;
		}else {
			i++;
		}
		}
		
		
		return cleaned;
	}

	public String toString()
	{
	
		return sentence + " - letter to remove " + lookFor+"\n"+removeLetters();
	}
}

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		word=s;
	}

	public void setWord(String s)
	{
		word=s;
	}
	
	public String buildTriangle() {
		String triangle="";
		for (int i = word.length(); i >0; i--) {
		triangle+=word.substring(0, i)+"\n";
		}
		return triangle;
		
	}

	public String toString()
	{
		return buildTriangle(); 
	}
}
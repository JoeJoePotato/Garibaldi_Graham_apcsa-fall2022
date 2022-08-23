
public class FirstLastVowel
{
   public String go( String a )
	{
	   char[] c={'a','e','i','o','u','A','E','I','O','U'};
	   for (int i = 0; i < c.length; i++) {
		if(a.charAt(0)==c[i] || a.charAt(a.length()-1)==c[i]) {
			return "yes";
		}
	}
	   
	   
	   
		return "no";
	}
}
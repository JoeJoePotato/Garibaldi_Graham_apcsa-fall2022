import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		int last=numArray.get(0);
		if(numArray.size()==0) {
			return false;
		}
		for(int i=1; i<numArray.size(); i++) {
			if(numArray.get(i)>=last) {
				return false;
			}
			last=numArray.get(i);
		}
		return true;
	}	
}
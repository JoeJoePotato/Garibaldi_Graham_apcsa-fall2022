import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int count=0;
		int first=ray.get(0);
		for(int i : ray) {
			if(i>first) {
				count+=i;
			}
		}
		
		if(count==0) {
			return -1;
		}
		return count;
	}
}
import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int oddindex=-1;
		int evenindex=0;
		for(int i=0; i<ray.size(); i++) {
			if(oddindex==-1) {
			if(ray.get(i)%2==1) {
				oddindex=i;
			}
			}else {
			if(ray.get(i)%2==0) {
				evenindex=i;
			}
			}
		}
		if(oddindex==-1 || evenindex==0) {
			return -1;
		}
		return evenindex-oddindex;
	}
}
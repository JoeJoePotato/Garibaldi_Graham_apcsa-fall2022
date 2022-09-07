
public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int oddspot=-1;
		int evenspot=0;
		boolean evenfound=false;
		for (int i = 0; i < ray.length; i++) {
			if(ray[i]%2==1) {
				oddspot=i;
				break;
			}
		}
		
		if(oddspot>=0) {
			for (int i = oddspot; i < ray.length; i++) {
				if(ray[i]%2==0) {
					evenspot=i;
					evenfound=true;
					break;
				}
			}
		}
	
		
		if(evenfound==false) {
			return -1;
		}

		return evenspot-oddspot;
	
		
		
	}
}
public class DownRunner
{
	public static void main( String args[] )
	{									
		RayDown s=new RayDown();
		int[] x= {-99,1,2,3,4,5,6,7,8,9,10,12345};
		System.out.println(s.go(x));
		int[] x2= {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(s.go(x2));
		int[] x3= {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(s.go(x3));
		int[] x4= {32767};
		System.out.println(s.go(x4));
		int[] x5= {255,255};
		System.out.println(s.go(x5));
		
		int[] x6= {9,10,-88,100,-555,1000};
		System.out.println(s.go(x6));
		
		int[] x7= {10,10,10,11,456};
		System.out.println(s.go(x7));
		
		int[] x8= {-111,1,2,3,9,11,20,30};
		System.out.println(s.go(x8));
		
		int[] x9= {9,8,7,6,5,4,3,2,0,-2,-989};
		System.out.println(s.go(x9));
		
		int[] x10= {12,15,18,21,23,1000};
		System.out.println(s.go(x10));
		
		int[] x11= {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		System.out.println(s.go(x11));
		
		int[] x12= {9,10,-8,10000,-5000,1000};
		System.out.println(s.go(x12));
		
		
	
	}
}
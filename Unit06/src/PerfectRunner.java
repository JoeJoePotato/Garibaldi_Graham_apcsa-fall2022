import static java.lang.System.*; 

public class PerfectRunner
{
	
	public static void main( String args[] )
	{
		Perfect p=new Perfect(496);
		System.out.println(p);
		testcase(45, p);
		testcase(6, p);
		testcase(14, p);
		testcase(8128, p);
		testcase(1245, p);
		testcase(33, p);
		testcase(28, p);
		testcase(27, p);
		testcase(33550336, p);
		
		
	}

	private static void testcase(int i, Perfect p) {
		p.setNum(i);
		System.out.println(p);
		
	}
}
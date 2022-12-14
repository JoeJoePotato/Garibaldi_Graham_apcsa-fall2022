//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups=new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		if(spot>=0 && spot< pups.length) {
		pups[spot]=new Dog(age, name);
		}
	}

	public String getNameOfOldest()
	{
		int oldest=0;
		for(int i=0; i<pups.length; i++) {
			if(pups[i].getAge()>oldest) {
				oldest=i;
			}
		}
		return pups[oldest].getName();
	}

	public String getNameOfYoungest()
	{
		int youngest=0;
		for(int i=0; i<pups.length; i++) {
			if(pups[i].getAge()<youngest) {
				youngest=i;
			}
		}
		return pups[youngest].getName();

	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}
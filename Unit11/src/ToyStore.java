//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList=new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		toyList=new ArrayList<Toy>();
		String s=toys;
		int i=0;
		System.out.println("here");
		while(s.length()!=0) {
		for(int j=0; j<s.length(); j++) {
					if(s.charAt(j)==' ') {
						toyList.add(new Toy(s.substring(i, j)));
						s=s.substring(j+1);
					}
				}
			
		}
		System.out.println("there");
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(int i=0; i<toyList.size(); i++) {
  			if(toyList.get(i).getName()==nm) {
  				return toyList.get(i);
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		for(int i=0; i<toyList.size(); i++) {
  			for(int j=i; j<toyList.size(); j++) {
  				if(toyList.get(i).getName().equals(toyList.get(j).getName())) {
  					Toy temp=new Toy(toyList.get(i).getName());
  				temp.setCount(toyList.get(i).getCount()+toyList.get(j).getCount());	
  				toyList.set(i, temp);
  				toyList.remove(j);
  				}
  			}
  		}
  		sortToysByCount();
  		
  		return toyList.get(toyList.size()-1).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		for(int i=0; i<toyList.size(); i++) {
  			for(int j=1; j<toyList.size(); j++) {
  				if(toyList.get(j).getCount()<toyList.get(j-1).getCount()) {
  					Toy temp=toyList.get(j);
  					toyList.set(j, toyList.get(j-1));
  					toyList.set(j-1, temp);
  				}
  			}
  		}
  	}  
  	  
	public String toString()
	{
		getMostFrequentToy();
		
	   return ""+toyList;
	}
}
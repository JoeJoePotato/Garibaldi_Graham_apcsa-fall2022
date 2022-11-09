//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m=new String[size][size];
    	int it=0;
    	for(int i=0; i<m.length; i++) {
    		for(int j=0; j<m[i].length; j++) {
    			m[i][j]=str.charAt(it)+"";
    			it++;
    		}
    	}
    
    }

    public boolean isFound( String word )
    {
    	
    	for(int i=0; i<m.length; i++) {
    		for(int j=0; j<m[i].length; j++) {
    			if(checkRight(word, i, j) || checkLeft(word, i, j) || checkUp(word, i, j) || checkDown(word, i, j) || checkDiagUpRight(word, i, j) || checkDiagUpLeft(word, i, j) || checkDiagDownRight(word, i, j) || checkDiagDownLeft(word, i, j)) {
    				return true; 
    			}
    			
    		}
    	}
    	
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		String search=w.toUpperCase();
		int y=r;
		int x=c;
		for(int i=0; i<w.length(); i++) {
			if(x<0 || y<0 || y>=m.length || x>=m[y].length) {
				return false;
			}
			if(search.charAt(i) != m[y][x].charAt(0)) {
				return false;
			}
			x++;
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String search=w.toUpperCase();
		int y=r;
		int x=c;
		for(int i=0; i<w.length(); i++) {
			if(x<0 || y<0 || y>=m.length || x>=m[y].length) {
				return false;
			}
			if(search.charAt(i) != m[y][x].charAt(0)) {
				return false;
			}
			x--;
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		String search=w.toUpperCase();
		int y=r;
		int x=c;
		for(int i=0; i<w.length(); i++) {
			if(x<0 || y<0 || y>=m.length || x>=m[y].length) {
				return false;
			}
			if(search.charAt(i) != m[y][x].charAt(0)) {
				return false;
			}
			y--;
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		String search=w.toUpperCase();
		int y=r;
		int x=c;
		for(int i=0; i<w.length(); i++) {
			if(x<0 || y<0 || y>=m.length || x>=m[y].length) {
				return false;
			}
			if(search.charAt(i) != m[y][x].charAt(0)) {
				return false;
			}
			y++;
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		String search=w.toUpperCase();
		int y=r;
		int x=c;
		for(int i=0; i<w.length(); i++) {
			if(x<0 || y<0 || y>=m.length || x>=m[y].length) {
				return false;
			}
			if(search.charAt(i) != m[y][x].charAt(0)) {
				return false;
			}
			x++;
			y--;
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		String search=w.toUpperCase();
		int y=r;
		int x=c;
		for(int i=0; i<w.length(); i++) {
			if(x<0 || y<0 || y>=m.length || x>=m[y].length){
				return false;
			}
			if(search.charAt(i) != m[y][x].charAt(0)) {
				return false;
			}
			x--;
			y--;
		}
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		String search=w.toUpperCase();
		int y=r;
		int x=c;
		for(int i=0; i<w.length(); i++) {
			if(x<0 || y<0 || y>=m.length || x>=m[y].length) {
				return false;
			}
			if(search.charAt(i) != m[y][x].charAt(0)) {
				return false;
			}
			x--;
			y++;
		}
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		String search=w.toUpperCase();
		int y=r;
		int x=c;
		for(int i=0; i<w.length(); i++) {
			if(x<0 || y<0 || y>=m.length || x>=m[y].length){
				return false;
			}
			if(search.charAt(i) != m[y][x].charAt(0)) {
				return false;
			}
			x++;
			y++;
		}
		return true;
	}

    public String toString()
    {
    	String print="";
    	for(String[] i : m) {
    		for(String j : i){
    		print+=j;
    		print+=" ";
    		
    		}
    		print+="\n";
    	}
 		return print;
    }
}

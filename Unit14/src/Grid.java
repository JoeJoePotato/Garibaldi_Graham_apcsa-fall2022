import java.util.Random;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -


public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		Random r=new Random();
		/*for(int i=0; i<vals.length; i++) {
			j=r.nextInt(vals.length);
			temp=vals[i];
			vals[i]=vals[j];
			vals[j]=temp;
		}*/
		grid=new String[rows][cols];		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				grid[i][j] = vals[r.nextInt(vals.length)];
			}
		}
		
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String max="";
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
			if(countVals(grid[i][j]) > countVals(max)){
				max=grid[i][j];
			}
			
			}
			}
		return max;
	}

	//returns a count of how many times val occurs in the matrix
	int countVals( String val )
	{
		int count=0;
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
			if(grid[i][j].equals(val)) {
				count++;
			}
			}
			}
				return count;
		
	}

	//display the grid
	public String toString()
	{
		String output="";
		String current="";
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
			current+=grid[i][j];
			current+=" ";
			}
			System.out.println(current);
			current="";
		}
		
		return output;
	}
}
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

import java.util.Scanner;
import static java.lang.System.*;
import java.util.random.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	Random r;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
		playChoice=player;
		r=new Random();
	}

	public void setPlayers(String player)
	{
		playChoice=player;
	}

	public String determineWinner()
	{
		//0=Rock
		//1=Paper
		//2=Scissors
		String winner="";
		int compplay=r.nextInt(3);
	
		if(compplay==0 && playChoice.equals("S")) {
			winner="computer wins! Rock crushes scissors";
		}else if(compplay==1 && playChoice.equals("R")) {
			winner="computer wins! Paper covers rock!";
		}else if(compplay==2 && playChoice.equals("P")) {
			winner="computer wins! Scissors cut paper";
		}else if(compplay==0 && playChoice.equals("P")) {
			winner="player wins! Paper covers rock";
		}else if(compplay==1 && playChoice.equals("S")) {
			winner="player wins! Scissors cut paper";
		}else if(compplay==2 && playChoice.equals("R")) {
			winner="player wins! Rock crushes scissors";
		}

		return winner;
	}

	public String toString()
	{
		String s=determineWinner();
		String output=s;
		if(output.equals("")) {
			output="Draw game!";
		}
		

		
		return output;
	}
}
import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		int playerscore=0;
		int computerscore=0;
		int a=1;
		while(a==1) {
		
			out.print("type in your prompt [R,P,S] :: ");
			String prompt=keyboard.next();
			//read in the player value
			
			RockPaperScissors game = new RockPaperScissors(prompt);		
			String s=game.toString();
			System.out.println(s);
			
			if(s.startsWith("player")) {
				playerscore++;
			}else if(s.startsWith("computer")) {
				computerscore++;
			}
			
			System.out.println("Player-"+playerscore+"vs. Computer-"+computerscore);
			if(computerscore==2) {
				System.out.println("COMPUTER WINS");
				a=2;
			}else if(playerscore==2) {
				System.out.println("PLAYER WINS");
				a=2;
			}
		}
		}
}



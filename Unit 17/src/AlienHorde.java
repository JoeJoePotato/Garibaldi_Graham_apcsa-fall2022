//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private int score;
	
	public AlienHorde(int size)
	{
		aliens=new ArrayList<Alien>();
		for(int i=0; i<size; i++) {
			aliens.add(new Alien(100*i+100, 10));
		}
		
		score=0;
	}

	public void add(Alien al)
	{
		aliens.add(new Alien(100, 10));
	}

	public void drawEmAll( Graphics window )
	{
		for(Alien a: aliens) {
			a.draw(window);
		}
	}
	
	public List<Alien> getList() {
		return aliens;
	}

	public void moveEmAll()
	{
		for(Alien a: aliens) {
			if(a.getX()>790 || a.getX()<10) {
				int s=a.getSpeed();
				a.setSpeed(10);
				a.move("DOWN");
			
				a.setSpeed(s*-1);
				a.move("RIGHT");
				
			}else {
				a.move("RIGHT");
				
			}
		}
		
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		List<Alien> toRemove=new ArrayList<Alien>();
		for(Ammo s : shots) {
			for(Alien a : aliens) {
				if(a.getX()<s.getX() && a.getY()<s.getY() && a.getX()+30>s.getX()+7 && a.getY()+30>s.getY()+10) {
					toRemove.add(a);
					if(score<1) {
						score=1;
					}
					score*=2;
				}
				
			}
		}
		
		for(Alien a : toRemove) {
			aliens.remove(a);
			
			aliens.add(new Alien(50, 10));
			aliens.add(new Alien(100, 10));
		}
		
	}

	public String toString()
	{
		return "Score: "+score;
	}
}

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,30,30,1);
	}

	public Alien(int x, int y)
	{
		//add code here
		this(x, y, 30, 30, 1);
	}

	public Alien(int x, int y, int s)
	{
		this(x, y, 20, 20, s);
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			URL url = getClass().getResource("/images/alien (2).png");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}

	public void setSpeed(int s)
	{
	   speed=s;
	}

	public int getSpeed()
	{
	   return speed;
	}

   public void move(String direction)
	{
	   if(direction.equals("UP")) {
			setY(getY()-speed);
		}else if(direction.equals("DOWN")) {
			setY(getY()+speed);
		}else if(direction.equals("LEFT")) {
			setX(getX()-speed);
		}else if(direction.equals("RIGHT")) {
			setX(getX()+speed);
		}
		
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return "";
	}
}

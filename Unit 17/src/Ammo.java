//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private Image image;

	
	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		super(x, y);
	}

	public Ammo(int x, int y, int s)
	{
		super(x, y);
		
		try
		{
			URL url = getClass().getResource("/images/ammo.png");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
		speed=s;
	}

	public void setSpeed(int s)
	{
	   speed=s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		//add code to draw the ammo
	 	window.drawImage(image,getX(),getY(), 7,10,null);
	}
	
	
	public void move( String direction )
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

	public String toString()
	{
		return "";
	}
}

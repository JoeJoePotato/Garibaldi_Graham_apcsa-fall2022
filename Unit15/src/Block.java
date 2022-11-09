//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos=10;
		yPos=10;
		

	}
	public Block(int x,int y)
	{
		xPos=x;
		yPos=y;
		

	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x,int y, int w, int h)
	{
		xPos=x;
		yPos=y;
		width=w;
		height=h;

	}
	
	
	
	public Block(int x,int y, int w, int h, Color c)
	{
		xPos=x;
		yPos=y;
		width=w;
		height=h;
		color=c;
	}
	

   //add the other set methods
   

   public void setColor(Color col)
   {
	   color=col;

   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{
		Block b=(Block) obj;
		return (xPos==b.getX() && yPos==b.getY() && color==b.getCol() && width==b.getWidth() && height==b.getHeight());
	}

	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		xPos=x;
		yPos=y;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		xPos=x;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		yPos=y;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return xPos;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return yPos;
	}   

   //add the other get methods
    public Color getCol() {
    	return color;
    }
    
    public int getWidth() {
    	return width;
    }
    
    
    public int getHeight() {
    	return height;
    }
   //add a toString() method  - x , y , width, height, color
    public String toString() {
    	return xPos+" "+yPos+" "+width+" "+height+" "+color;
    }
    
    
}
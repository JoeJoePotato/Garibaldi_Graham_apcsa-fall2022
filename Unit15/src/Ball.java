//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y) {
		super(x, y, 10, 10, new Color(255, 255, 255));
		xSpeed =3;
		ySpeed=1;
	}
	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h, new Color(255, 255, 255));
		xSpeed=3;
		ySpeed=1;
	}
	public Ball(int x, int y, int w, int h, Color col) {
		super(x, y, w, h, col);
		xSpeed=3;
		ySpeed=1;
	}
	public Ball(int x, int y, int w, int h, Color col, int xs, int ys) {
		super(x, y, w, h, col);
		xSpeed=xs;
		ySpeed=ys;
	}
	public Ball(int x, int y, int w, int h, int xs, int ys) {
		super(x, y, w, h);
		xSpeed=xs;
		ySpeed=ys;
	}

	//add the other Ball constructors
	
	
	
	
	
	
	
	
	
	
	
	
	   
   //add the set methods
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, new Color(255, 255, 255));
	 

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window, getCol());
   }
   
	public boolean equals(Object obj)
	{
		Ball b=(Ball) obj;
		return (getX()==b.getX() && getY()==b.getY() && getCol()==b.getCol() && getWidth()==b.getWidth() && getHeight()==b.getHeight() && xSpeed==b.getXSpeed() && ySpeed==b.getYSpeed());
	
	}   

   //add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}
	public void setYSpeed(int ys) {
		// TODO Auto-generated method stub
		ySpeed=ys;
	}
	public void setXSpeed(int xs) {
		xSpeed=xs;
	}
	

   //add a toString() method
}
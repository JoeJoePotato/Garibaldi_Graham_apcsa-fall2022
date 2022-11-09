//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10, 10, 10, new Color(0, 0, 0));
      speed =5;
   }
   
   public Paddle(int x, int y) {
	   super(x, y, 10, 10, new Color(0, 0, 0));
	   speed=5;
   }

   public Paddle(int x, int y, int s) {
	   super(x, y, 10, 10, new Color(0, 0, 0));
	   speed=s;
   }



   public Paddle(int x, int y, int w, int h, int s) {
	   super(x, y, w, h, new Color(255, 255, 255));

	   speed=s;
   }
   
   public Paddle(int x, int y, int w, int h, Color col, int s) {
	   super(x, y, w, h, col);

	   speed=s;
   }
   
   
   //add the other Paddle constructors










   public void moveUpAndDraw(Graphics window)
   {

	  draw(window, Color.WHITE);
		 
	      setY(getY()-speed);
		
	      draw(window, getCol());
   }

   public void moveDownAndDraw(Graphics window)
   {

	   draw(window, Color.WHITE);
		 
	      setY(getY()+speed);
		
	      draw(window, getCol());

   }

   //add get methods
   public int getSpeed() {
	   return speed;
   }
   
   //add a toString() method
   
   public String toString() {
   	return getX()+" "+getY()+" "+getWidth()+" "+getHeight()+" "+getCol()+speed;
   }
}
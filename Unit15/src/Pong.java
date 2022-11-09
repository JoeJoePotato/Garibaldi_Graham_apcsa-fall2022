//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftscore;
	private int rightscore;


	public Pong()
	{
		leftscore=0;
		rightscore=0;
		//set up all variables related to the game
		ball = new Ball(100,100,10,10,Color.BLUE,1,1);
		//ball = new BlinkyBall(100,100,10,10,Color.BLUE,1,1);
		//ball = new SpeedUpBall(100,100,10,10,Color.BLUE,1,1);
		//instantiate a left Paddle
		leftPaddle=new Paddle(60, 10, 10, 150, Color.RED, 5);
		
		
		
		//instantiate a right Paddle
		rightPaddle=new Paddle(540, 10, 10, 150, Color.RED, 5);




		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;
		

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));
		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		String s="Left: "+leftscore+"\nRight: "+rightscore;
		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(50, 50, 300,100);
		

		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		graphToBack.drawString(s, 100, 100);
		
		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=550))
		{
			if(ball.getX()<100) {
				rightscore++;
			}else {
				leftscore++;
			}
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
		}

		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setXSpeed(ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
		}




		//see if the ball hits the left paddle
		if(ball.getX()>leftPaddle.getX() && ball.getX()<(leftPaddle.getX()+leftPaddle.getWidth())) {
			if(ball.getY()>leftPaddle.getY() && ball.getY()<(leftPaddle.getY()+leftPaddle.getHeight()-ball.getHeight())){
				ball.setXSpeed(-ball.getXSpeed());
				ball.setYSpeed(ball.getYSpeed());
			}
		}
		
		
		//see if the ball hits the right paddle
		if(ball.getX()>(rightPaddle.getX()-ball.getWidth()) && ball.getX()<(rightPaddle.getX())) {
			if(ball.getY()>rightPaddle.getY() && ball.getY()<(rightPaddle.getY()+rightPaddle.getHeight()-ball.getHeight())){
				ball.setXSpeed(-ball.getXSpeed());
				ball.setYSpeed(ball.getYSpeed());
				
			}
		}
		
		


		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
		
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
		
			leftPaddle.moveDownAndDraw(graphToBack);

		}
		if(keys[2] == true)
		{
			
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			
			rightPaddle.moveDownAndDraw(graphToBack);
		}














		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}
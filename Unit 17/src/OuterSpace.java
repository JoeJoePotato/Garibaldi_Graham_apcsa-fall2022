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
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	
	private int shottimer;
	private boolean playing;
   private AlienHorde horde;
	private Bullets shots;
	private Bullets alienshots;


	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship=new Ship();
		shots=new Bullets();
		alienshots=new Bullets();
		shottimer=0;
		playing=true;
		horde=new AlienHorde(8);
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		if(playing == true) {
	
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		
		ship.draw(graphToBack);

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		
		if(keys[0] == true)
		{

			ship.move("LEFT");
		}else if(keys[1]==true) {
			ship.move("RIGHT");
		}else if(keys[2]==true) {
			ship.move("UP");
		}else if(keys[3]==true) {
			ship.move("DOWN");
		}
		
		if(keys[4]==true) {
			if(shottimer>150){
			shots.add(new Ammo(ship.getX()+ship.getWidth()/2, ship.getY(), 1));
			shottimer=0;
			}
		}

		//add code to move Ship, Alien, etc.
		shots.drawEmAll(graphToBack);
		shots.moveEmAll("UP");
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		shottimer++;
		
		horde.drawEmAll(graphToBack);
		horde.moveEmAll();
		
		horde.removeDeadOnes(shots.getList());
		
		for(Alien a : horde.getList()) {
			if(a.getX()+15==ship.getX()+(0.5*ship.getWidth())) {
				alienshots.add(new Ammo(a.getX()+15, a.getY()+30, 1));
			}
		}
		
		for(Ammo a : alienshots.getList()) {
			if(ship.getX()<a.getX() && ship.getY()+60<a.getY() && ship.getX()+ship.getWidth()-10>a.getX()+7 && ship.getY()+ship.getHeight()>a.getY()+10) {
				
				System.out.println(horde);
				playing=false;
			}
		}

		alienshots.drawEmAll(graphToBack);
		alienshots.moveEmAll("DOWN");
		
		
		if(playing==true) {
		twoDGraph.drawImage(back, null, 0, 0);
		}
		}
		
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}


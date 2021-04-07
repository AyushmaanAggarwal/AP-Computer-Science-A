import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Person 
{
	private ArrayList<Image> list;	
	private int x, y, current;
	
	public Person(int x, int y) throws IOException
	{
		this.x=x;
		this.y=y;
		
		//point the array list at a new ArrayList
        list = new ArrayList<Image>();
		//add all images to the list
        Image front = ImageIO.read(new File("dude.gif"));
        list.add(front);
        Image U = ImageIO.read(new File("dudeU.gif"));
        list.add(U);
        Image R = ImageIO.read(new File("dudeR.gif"));
        list.add(R);
        Image L = ImageIO.read(new File("dudeL.gif"));
        list.add(L);
	}
	
	// will return true if person collides with another object
	public boolean collide(int x, int y)
	{
		Rectangle a = new Rectangle(this.x, this.y, 50, 50);
		Rectangle b = new Rectangle(x, y, 50, 50);
		return a.intersects(b);
	}
	
	public void drawPerson(Graphics2D g)
	{
		Graphics.drawImage(g, x, y, null);
	}
	
	public Image getCurrent()
	{
		return list.get(current);
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	
	public void moveRight()
	{
		current = 3;		
	}
	
	public void moveLeft()
	{
		current = 4;
	}
	
	public void moveUp()
	{
		current = 1;
	}
	
	public void moveDown()
	{
		current = 0;
	}
}
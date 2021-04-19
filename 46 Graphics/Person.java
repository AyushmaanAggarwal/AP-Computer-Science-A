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
        list.add(ImageIO.read(new File("C:\\Users\\ayush\\Programming\\ApJava2020\\46 Graphics\\dude.gif")));
        list.add(ImageIO.read(new File("C:\\Users\\ayush\\Programming\\ApJava2020\\46 Graphics\\dudeU.gif")));
        list.add(ImageIO.read(new File("C:\\Users\\ayush\\Programming\\ApJava2020\\46 Graphics\\dudeR.gif")));
        list.add(ImageIO.read(new File("C:\\Users\\ayush\\Programming\\ApJava2020\\46 Graphics\\dudeL.gif")));
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
		g.drawImage(list.get(current), x, y, null);
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
		current = 2;	
		x = x+50;	
	}
	
	public void moveLeft()
	{
		current = 3;
		x = x-50;
	}
	
	public void moveUp()
	{
		current = 0;
		y = y + 50;
	}
	
	public void moveDown()
	{
		current = 1;
		y = y - 50;
	}
}
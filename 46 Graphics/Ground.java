import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Ground 
{
	private ArrayList<Image> tiles;
	
	public Ground() throws IOException
	{
		//point the tiles at new array list
		tiles = new ArrayList<Image>();
		//add in each of the images for the grass.gif, gtoroad.gif, road.gif, rtograss.gif
		tiles.add(ImageIO.read(new File("C:\\Users\\ayush\\Programming\\ApJava2020\\46 Graphics\\grass.gif")));
        tiles.add(ImageIO.read(new File("C:\\Users\\ayush\\Programming\\ApJava2020\\46 Graphics\\gtoroad.gif")));
        tiles.add(ImageIO.read(new File("C:\\Users\\ayush\\Programming\\ApJava2020\\46 Graphics\\road.gif")));
        tiles.add(ImageIO.read(new File("C:\\Users\\ayush\\Programming\\ApJava2020\\46 Graphics\\rtograss.gif")));
        	
	}
	
	public void drawGround(Graphics2D g)
	{
		//draw the ground on the screen	
        for(int i = 0; i<100; i+=1){
            g.drawImage(tiles.get(0), i*50, 0, null);
        }
        for(int i = 0; i<100; i+=1){
            g.drawImage(tiles.get(0), i*50, 50, null);
        }
        for(int i = 0; i<100; i+=1){
            g.drawImage(tiles.get(1), i*50, 100, null);
        }  
        for(int i = 0; i<100; i+=1){
            g.drawImage(tiles.get(2), i*50, 150, null);
        }
        for(int i = 0; i<100; i+=1){
            g.drawImage(tiles.get(2), i*50, 200, null);
        }
        for(int i = 0; i<100; i+=1){
            g.drawImage(tiles.get(2), i*50, 250, null);
        }
        for(int i = 0; i<100; i+=1){
            g.drawImage(tiles.get(2), i*50, 300, null);
        }
        for(int i = 0; i<100; i+=1){
            g.drawImage(tiles.get(2), i*50, 350, null);
        }
        for(int i = 0; i<100; i+=1){
            g.drawImage(tiles.get(2), i*50, 400, null);
        }
        for(int i = 0; i<100; i+=1){
            g.drawImage(tiles.get(2), i*50, 450, null);
        }
        for(int i = 0; i<100; i+=1){
            g.drawImage(tiles.get(3), i*50, 500, null);
        }
        for(int i = 0; i<100; i+=1){
            g.drawImage(tiles.get(0), i*50, 550, null);
        }
	}	
}
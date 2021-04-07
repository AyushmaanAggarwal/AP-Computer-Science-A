import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class SmileyFace extends Canvas{
	private int WIDTH;
	private int HEIGHT;
	public SmileyFace(int width, int height) {
		setBackground(Color.BLUE);
		WIDTH = width;
		HEIGHT = height;
	}
	public void paint(Graphics window) {
		window.setColor(Color.YELLOW);
		window.fillOval(10,10,700,700);
		
		window.setColor(Color.WHITE);
		window.fillOval(150,150,100,100);
		window.fillOval(450, 150, 100, 100);
		
		window.setColor(Color.BLACK);
		window.fillOval(200,200,40,40);
		window.fillOval(500, 200, 40, 40);
		window.fillOval(350, 300, 40, 40);

		for(int i = 400; i >370; i--) {
			window.drawArc(200,i,300,100,-180,180);
		}
	}
}

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Union extends JFrame {
	private final Color BISQUE = new Color(0xcdb79e);
	 
	public Union(){
		init();
	}
	public void init() {
		//this code is to paint the background and the size of the flag
		setSize(1235,650+650/13-650/26);
		setBackground(Color.BLUE);
		repaint();
	}
	public void paint(Graphics g) {
		//this states the length and width of the stripes
		int length = 1235*7/13;
		int width = 650*76/100;
		g.setColor(Color.BLUE);
		g.fillRect(0,0,length,width);
		//use for loop to paint the stripes.
		
	 }
}


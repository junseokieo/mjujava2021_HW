package weather;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class drawGraph extends JPanel{
	public drawGraph() {
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawLine(0,0,100,100);
	}

}

package softwareArchitecture;
/**
import javax.swing.*;
import java.awt.*;

public class Alien {

}**/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Alien extends JPanel{
	//position variables
	int posX = 50;
	int posY = 50;
	
	// Draws the alien
	public void paintComponent(Graphics alien){
		int x = 50;
		
		
		alien.setColor(Color.BLACK);
		alien.fillArc(x-2,x-2,104,90,0,180);
		
		alien.setColor(Color.GREEN);
		alien.fillArc(x, x, 100, 80, 0, 180);
		
		alien.setColor(Color.BLACK);
		alien.fillOval(x+5, x+25, 10, 10);
		
		alien.setColor(Color.BLACK);
		alien.fillOval(x+25, x+25, 10, 10);
		
		alien.setColor(Color.BLACK);
		alien.fillOval(x+45, x+25, 10, 10);
		
		alien.setColor(Color.BLACK);
		alien.fillOval(x+65, x+25, 10, 10);
		
		alien.setColor(Color.BLACK);
		alien.fillOval(x+85, x+25, 10, 10);
		
		}
		

	public static void main(String[] args){
		
		JFrame w = new JFrame("Alien");
		w.setBounds(300, 300, 300, 200);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = w.getContentPane();
		c.add(new Alien());
		w.setVisible(true);
	}
}
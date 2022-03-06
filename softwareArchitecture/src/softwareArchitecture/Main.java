package softwareArchitecture;

import javax.swing.*;
import java.awt.*;


//hello World in swing

public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Hello World Java Swing");

		// set frame site
		frame.setMinimumSize(new Dimension(800, 800));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		// center the JLabel
		JLabel lblText = new JLabel("Hello World!", SwingConstants.CENTER);
		lblText.setForeground (Color.YELLOW);

		// add JLabel to JFrame
		frame.getContentPane().add(lblText);
		frame.getContentPane().setBackground(Color. BLACK);

		// display it
		frame.pack();
		frame.setVisible(true);
		

	}
}



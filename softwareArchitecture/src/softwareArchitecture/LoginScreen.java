package softwareArchitecture;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class LoginScreen {
	public static void main(String[] args) {

		JFrame frame = new JFrame("Login Screen");

		// set frame site
		frame.setMinimumSize(new Dimension(800, 800));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		// center the JLabel
		JLabel lblText = new JLabel("Click here to login", SwingConstants.CENTER);
		lblText.setForeground (Color.YELLOW);

		JButton okBtn = new JButton("Click here to continue as guest");
		lblText.setForeground (Color.GRAY);
		
		// add JLabel to JFrame
		frame.getContentPane().add(lblText);
		frame.getContentPane().add(okBtn);
		frame.getContentPane().setBackground(Color. BLACK);

		// display it
		frame.pack();
		frame.setVisible(true);
		
	}
}

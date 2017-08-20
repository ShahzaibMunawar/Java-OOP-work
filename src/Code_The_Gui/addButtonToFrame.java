package Code_The_Gui;

import javax.swing.*;
import java.awt.event.*;

public class addButtonToFrame {
	// =====Simple button
	// public static void main(String[] args) {
	// JFrame f = new JFrame();// creating instance of JFrame
	//
	// JButton b = new JButton("click");// creating instance of JButton
	// b.setBounds(130, 100, 100, 40);// x axis, y axis, width, height
	//
	// f.add(b);// adding button in JFrame
	//
	// f.setSize(400, 500);// 400 width and 500 height
	// f.setLayout(null);// using no layout managers
	// f.setVisible(true);// making the frame visible
	// }

	// ===============Jbutton with action listioner

	public static void main(String[] args) {
		JFrame f = new JFrame("Button Example");

		final JTextField tf = new JTextField();// creating instance of textfield
		tf.setBounds(50, 50, 150, 20);

		JButton b = new JButton("Click Here");// creating instance of button
		b.setBounds(50, 100, 95, 30);

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Welcome to Javatpoint.");
			}
		});

		f.add(b);
		f.add(tf);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

}

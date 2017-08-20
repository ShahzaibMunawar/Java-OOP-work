package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiTest extends JFrame implements ActionListener {
	private JFrame f;
	private JPanel p;
	private JButton b1;
	private JLabel lab;

	GuiTest() {
		setTitle("Introduction to GUI");
		setVisible(true);
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		components();

	}

	public void components() {
		p = new JPanel();
		p.setBackground(Color.YELLOW);
		b1 = new JButton("Test");
		lab = new JLabel(" Thi s i s testlabel");
		p.add(b1);
		p.add(lab);
		add(p);
		add(p, BorderLayout.SOUTH); // this will move the whole components in p
									// bottem

		b1.addActionListener(new ActionListener() {  // event
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Button is clicked");
			}
		});
		
		
		
		p.add(b1);
		p.add(lab);
		add(p, BorderLayout.NORTH);

	}

}

class mainForGui {
	public static void main(String args[]) {
		GuiTest g1 = new GuiTest();
	}
}

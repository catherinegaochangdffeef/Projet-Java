package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Welcome extends JFrame{
	JPanel panel = new JPanel();
	JButton button;
	public Welcome() {
		
		
		/*background image*/
		Icon i = new ImageIcon("src\\vue\\Welcome.jpg");
		JLabel label = new JLabel(i);
		label.setBounds(0, 0, 1000, 800);
		
		
		panel.setLayout(null);
		panel.setBounds(0, 0, 1000, 800);
		
		panel.add(label);
	}
}

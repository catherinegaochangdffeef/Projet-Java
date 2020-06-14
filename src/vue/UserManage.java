package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controleur.AddUser;
import controleur.DeleteUser;

public class UserManage extends JFrame{
	JPanel panel = new JPanel();	
	public UserManage() {
		
		panel.setLayout(null);
		
		//改变窗口图标
		Toolkit tool = Toolkit.getDefaultToolkit();
		Image img = tool.getImage("src\\vue\\sign.jpg");
		this.setIconImage(img);
		
		/*设置窗口背景图案*/
		Icon i = new ImageIcon("src\\vue\\background5.jpg");
		JLabel label = new JLabel(i);
		label.setBounds(0, 0,1000, 800);
		
		JLabel lab = new JLabel("Gestion Des Clients");
		Font font1 = new Font("Arial",Font.BOLD,40);
		lab.setFont(font1);
		lab.setForeground(Color.WHITE);
		lab.setBounds(300, 50, 500, 100);
		panel.add(lab);
		
		Dimension d = new Dimension(200,50);
		Font font2 = new Font("Arial",Font.BOLD,25);
		
		JButton button1 = new JButton("Ajouter un client");

		JButton button2 = new JButton("Supprimer un client");
		
		button1.setBackground(Color.pink);
		button2.setBackground(Color.pink);
	
		button1.setPreferredSize(d);
		button2.setPreferredSize(d);
	
		
		button1.setBounds(320, 170, 300, 50);
		button2.setBounds(320, 270, 300, 50);

		button1.setFont(font2);
		button1.setForeground(Color.WHITE);
		button2.setFont(font2);
		button2.setForeground(Color.WHITE);

		
		panel.add(button1);
		panel.add(button2);
	
		panel.add(label);
		
		/*添加用户*/
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AddUser au = new AddUser();
				
			}
		});
	
		
		
		
		
		
		/*删除用户*/
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new DeleteUser();
				
			}
		});
		
		panel.setOpaque(false);
		lab.setOpaque(false);
		
	}
	
}

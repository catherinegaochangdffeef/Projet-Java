package controleur;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class DeleteUser {
	
	public DeleteUser() {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.setTitle("Delete un client");
		
		//�ı䴰��ͼ��
		Toolkit tool = Toolkit.getDefaultToolkit();
		Image img = tool.getImage("src\\vue\\sign.jpg");
		f.setIconImage(img);
		
		/*���ô��ڱ���ͼ��*/
		Icon i = new ImageIcon("src\\vue\\admin_background.jpg");
		JLabel label = new JLabel(i);
		label.setBounds(0, 0, 500, 500);
		
		
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel5 = new JPanel();
		
		Font font = new Font("Arial",Font.BOLD,30);
		Font font1 = new Font("Arial",Font.PLAIN,20);
		Dimension dimension = new Dimension(300,40);
		/*�û�����ǩ*/
		JLabel labname= new JLabel(" identifiant");
		labname.setFont(font);
		panel1.add(labname);
		panel1.setBounds(50, 100, 200, 60);
		
		/*�û��������ı���*/
		JTextField textname = new JTextField(12);
		panel2.setLayout(null);
		textname.setSize(dimension);
		textname.setFont(font1);
		panel2.add(textname);
		panel2.setBounds(100, 180, 500, 50);
		
		
		
		
		/*��Ӱ�ť*/
		JButton button = new JButton("Supprimer");
		button.setPreferredSize(dimension);
		button.setBackground(Color.PINK);
		button.setFont(new Font("Arial",Font.BOLD,25));
		panel5.add(button);
		panel5.setBounds(100, 250, 300, 100);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
					JOptionPane.showMessageDialog(null, "R��ussi �� supprimer", "Supprim��", JOptionPane.PLAIN_MESSAGE);
				
			}
		});
		
		
		f.add(panel1);
		f.add(panel2);
		f.add(panel5);
		f.add(label);
		
		textname.setOpaque(false);
		panel1.setOpaque(false);
		panel2.setOpaque(false);
		panel5.setOpaque(false);
		
		f.setVisible(true);
	}
}



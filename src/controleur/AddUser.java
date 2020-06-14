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


import model.ClientOccasionnel;
import storage.Videotheque;


public class AddUser {
	
	public AddUser() {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.setTitle("ajouter un client");
		
		//icon
		Toolkit tool = Toolkit.getDefaultToolkit();
		Image img = tool.getImage("src\\vue\\sign.jpg");
		f.setIconImage(img);
		
		/*background set */
		Icon i = new ImageIcon("src\\vue\\admin_background.jpg");
		JLabel label = new JLabel(i);
		label.setBounds(0, 0, 500, 500);
		
		
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		
		Font font = new Font("Arial",Font.BOLD,20);
		Font font1 = new Font("Arial",Font.PLAIN,20);
		Dimension dimension = new Dimension(200,40);

		
		/*etiquette*/
		JLabel labname= new JLabel(" Identifiant");
		labname.setFont(font);
		panel1.add(labname);
		panel1.setBounds(50, 20, 200, 60);
		
		/*textfield*/
		JTextField textname = new JTextField(12);
		panel2.setLayout(null);
		textname.setSize(dimension);
		textname.setFont(font1);
		panel2.add(textname);
		panel2.setBounds(100, 50, 500, 50);
		
		/* etiquette*/
		JLabel labname1 = new JLabel("nom");
		labname1.setFont(font);
		panel3.add(labname1);
		panel3.setBounds(50, 90, 200, 60);
		
		/*textfield*/
		JTextField textname1 = new JTextField(12);
		panel4.setLayout(null);
		textname1.setSize(dimension);
		textname1.setFont(font1);
		panel4.add(textname1);
		panel4.setBounds(100, 120, 500, 50);
		
		JLabel labname2 = new JLabel("Prénom");
		labname2.setFont(font);
		panel5.add(labname2);
		panel5.setBounds(50, 160, 200, 60);
		
		/*textfield*/
		JTextField textname2 = new JTextField(12);
		panel6.setLayout(null);
		textname2.setSize(dimension);
		textname2.setFont(font1);
		panel6.add(textname2);
		panel6.setBounds(100, 190, 500, 50);
		
		
		/*ajouter un button*/
		JButton button = new JButton("Ajouter");
		button.setPreferredSize(dimension);
		button.setBackground(Color.PINK);
		button.setFont(new Font("Arial",Font.BOLD,25));
		panel7.add(button);
		panel7.setBounds(100, 300, 300, 100);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Integer id = Integer.valueOf(textname.getText().trim());
				String nom = textname1.getText().trim();
				String prenom = textname2.getText().trim();
				ClientOccasionnel client1 = new ClientOccasionnel(nom,prenom,id); 

		Videotheque.ajouterClient(client1);
			
					JOptionPane.showMessageDialog(null, "Réussi à ajouter", "Ajouter", JOptionPane.PLAIN_MESSAGE);
							}
		});
		
		
		f.add(panel1);
		f.add(panel2);
		f.add(panel3);
		f.add(panel4);
		f.add(panel5);
		f.add(panel6);
		f.add(panel7);
		
		f.add(label);
		
		textname.setOpaque(false);
		textname1.setOpaque(false);
		textname2.setOpaque(false);
		panel1.setOpaque(false);
		panel2.setOpaque(false);
		panel3.setOpaque(false);
		panel4.setOpaque(false);
		panel5.setOpaque(false);
		panel6.setOpaque(false);
		panel7.setOpaque(false);
		
		f.setVisible(true);
	}
}


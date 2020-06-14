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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;

import model.ClientOccasionnel;
import model.Product;
import storage.Videotheque;


public class AddProduit {

	public AddProduit() {
		// TODO Auto-generated constructor stub
		JFrame f = new JFrame();
		f.setSize(800, 800);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.setTitle("ajouter un produit");
		
		//icon
				Toolkit tool = Toolkit.getDefaultToolkit();
				Image img = tool.getImage("src\\vue\\sign.jpg");
				f.setIconImage(img);
				
		/*background set */
		Icon i = new ImageIcon("src\\vue\\admin_background.jpg");
		JLabel label = new JLabel(i);
		label.setBounds(0, 0, 900, 900);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		JPanel panel11 = new JPanel();
		JPanel panel12 = new JPanel();
		JPanel panel13 = new JPanel();
		JPanel panel14 = new JPanel();
		JPanel panel15 = new JPanel();
		JPanel panel16 = new JPanel();
		JPanel panel17 = new JPanel();
		
		
		
		Font font = new Font("Arial",Font.BOLD,20);
		Font font1 = new Font("Arial",Font.PLAIN,20);
		Dimension dimension = new Dimension(200,40);
		
		/*etiquette*/
		
		JLabel lab3 = new JLabel("Choisir le type de produit");
		lab3.setFont(font);
		panel16.add(lab3);
		panel16.setForeground(Color.WHITE);
		panel16.setBounds(80, 60, 300, 60);
		
		
		/*combobox */
		Dimension dimension1 = new Dimension(220,30);
		JComboBox<String> j = new JComboBox<>();
		j.setSize(dimension1);
		j.addItem("Livres");
		j.addItem("Dictionnaires");
		j.addItem("CD");
		j.addItem("DVD");
		j.setBounds(200,60,220, 30);
		j.setFont(font1);
		panel17.add(j);
		panel17.setBackground(Color.pink );
		
		
		
		/*etiquette*/
		JLabel labname= new JLabel(" Identifiant");
		labname.setFont(font);
		panel1.add(labname);
		panel1.setBounds(50,120, 200, 60);
		
		/*textfield*/
		JTextField textname = new JTextField(12);
		panel2.setLayout(null);
		textname.setSize(dimension1);
		textname.setFont(font1);
		panel2.add(textname);
		panel2.setBounds(100,150, 500, 50);
		
		/* etiquette*/
		JLabel labname1 = new JLabel("titre");
		labname1.setFont(font);
		panel3.add(labname1);
		panel3.setBounds(50,170,200, 60);
		
		/*textfield*/
		JTextField textname1 = new JTextField(12);
		panel4.setLayout(null);
		textname1.setSize(dimension1);
		textname1.setFont(font1);
		panel4.add(textname1);
		panel4.setBounds(100,200, 500, 50);
		
		JLabel labname2 = new JLabel("tarif du jour");
		labname2.setFont(font);
		panel5.add(labname2);
		panel5.setBounds(50, 230, 200, 60);
		
		/*textfield*/
		JTextField textname2 = new JTextField(12);
		panel6.setLayout(null);
		textname2.setSize(dimension1);
		textname2.setFont(font1);
		panel6.add(textname2);
		panel6.setBounds(100, 260, 500, 50);
		
		JLabel labname3 = new JLabel("auteur");
		labname3.setFont(font);
		panel7.add(labname3);
		panel7.setBounds(50, 290, 200, 60);
		
		/*textfield*/
		JTextField textname3 = new JTextField(12);
		panel8.setLayout(null);
		textname3.setSize(dimension1);
		textname3.setFont(font1);
		panel8.add(textname3);
		panel8.setBounds(100, 320, 500, 50);
		
		JLabel labname4 = new JLabel("langue");
		labname4.setFont(font);
		panel9.add(labname4);
		panel9.setBounds(50, 350, 200, 60);
		
		/*textfield*/
		JTextField textname4 = new JTextField(12);
		panel10.setLayout(null);
		textname4.setSize(dimension1);
		textname4.setFont(font1);
		panel10.add(textname4);
		panel10.setBounds(100, 380, 500, 50);
		
		JLabel labname5 = new JLabel("Année de sortie");
		labname5.setFont(font);
		panel11.add(labname5);
		panel11.setBounds(50,410,250, 60);
		
		/*textfield*/
		JTextField textname5 = new JTextField(12);
		panel12.setLayout(null);
		textname5.setSize(dimension1);
		textname5.setFont(font1);
		panel12.add(textname5);
		panel12.setBounds(100, 440, 500, 50);
		
		JLabel labname6 = new JLabel("Réalisateur");
		labname6.setFont(font);
		panel13.add(labname6);
		panel13.setBounds(50, 470, 200, 60);
		
		/*textfield*/
		JTextField textname6 = new JTextField(12);
		panel14.setLayout(null);
		textname6.setSize(dimension1);
		textname6.setFont(font1);
		panel14.add(textname6);
		panel14.setBounds(100, 500, 500, 50);
		
	
		/*ajouter un button*/
		JButton button = new JButton("Ajouter");
		button.setPreferredSize(dimension1);
		button.setBackground(Color.PINK);
		button.setFont(new Font("Arial",Font.BOLD,25));
		panel15.add(button);
		panel15.setBounds(100, 550, 300, 100);
		
		button.addActionListener(new ActionListener() {
				
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
	f.add(panel8);
	f.add(panel9);
	f.add(panel10);
	f.add(panel11);
	f.add(panel12);
	f.add(panel13);
	f.add(panel14);
	f.add(panel15);
	f.add(panel16);
	f.add(panel17);
	

	
	
	f.add(label);
	
	textname.setOpaque(false);
	textname1.setOpaque(false);
	textname2.setOpaque(false);
	textname3.setOpaque(false);
	textname4.setOpaque(false);
	textname5.setOpaque(false);
	textname6.setOpaque(false);

	panel1.setOpaque(false);
	panel2.setOpaque(false);
	panel3.setOpaque(false);
	panel4.setOpaque(false);
	panel5.setOpaque(false);
	panel6.setOpaque(false);
	panel7.setOpaque(false);
	panel8.setOpaque(false);
	panel9.setOpaque(false);
	panel10.setOpaque(false);
	panel11.setOpaque(false);
	panel12.setOpaque(false);
	panel13.setOpaque(false);
	panel14.setOpaque(false);
	panel15.setOpaque(false);
	panel16.setOpaque(false);

	label.setOpaque(false);
	
	f.setVisible(true);

		
		
		
		
		
	
		
		
		
		
	}

}

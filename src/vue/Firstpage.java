package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Firstpage {
	private String name;
	public void init() {
		JFrame f=new JFrame("Bienvenue dans la gestion d'une vidéothèque!");
//changer icon de la fênêtre		
		Toolkit t=Toolkit.getDefaultToolkit();
		Image img=t.getImage("src\\vue\\sign.jpg");
		f.setIconImage(img);
// set la taille d'une fenetre
		f.setSize(600,600);
// set la fenetre au milieu
		f.setLocationRelativeTo(null);
// set layout est vide
		f.setLayout(null);
		
// set la background de la fenetre
		Icon i=new ImageIcon("src\\vue\\background4.jpg");
		JLabel jLable=new JLabel(i);
		jLable.setBounds(0,0,600,600);
		
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();
		JPanel panel6=new JPanel();
		
//ajouter la text en haut
		JLabel lable= new JLabel("Gestion de la vidéothèque");
		Font font = new Font("Arial",Font.BOLD,35);
		lable.setFont(font);
		lable.setForeground(Color.WHITE);
		panel1.add(lable);
		panel1.setBounds(60,60,500,300);// set la taille de panel
		f.add(panel1);
//etiquette de la type de utilisateur
		JLabel user= new JLabel("Type d'utilisateur");
		Font font1=new Font("Arial", Font.BOLD,25);
		user.setFont(font1);
		user.setForeground(Color.WHITE);
		panel2.add(user);
// deux type de utilisateur	
		JComboBox<String> j= new JComboBox<String>();
		Dimension dimension = new Dimension(200,30);// la taille de ce box
		j.setPreferredSize(dimension);
		j.addItem("Client");
		j.addItem("Administrateur");
		Font font2=new Font("Arial", Font.BOLD,15);
		j.setFont(font2);
		j.setForeground(Color.WHITE);
		panel2.setBounds(90,160,400,300);
		panel2.add(j);
		f.add(panel2);

//etiquette de compte
		JLabel labid=new JLabel("Compte:");
		Font font3=new Font("Arial", Font.BOLD,20);
		labid.setFont(font3);
		labid.setForeground(Color.WHITE);
		panel3.add(labid);
// la textfield de la compte
		JTextField id= new JTextField();
		id.setPreferredSize(dimension);
		panel3.add(id);
		panel3.setBounds(110,230,400,300);
		f.add(panel3);
// etiquette de la mode de passe
		JLabel labpassword= new JLabel("Mot de passe:");
		Font font4= new Font("Arial",Font.BOLD,20);
		labpassword.setFont(font4);
		labpassword.setForeground(Color.WHITE);
		panel4.add(labpassword);
// la textfield de la mode de passe
		JPasswordField password= new JPasswordField();
		password.setPreferredSize(dimension);
		Font font5= new Font("Arial",Font.BOLD,25);
		password.setFont(font5);
		panel4.add(password);
		panel4.setBounds(90,290,400,300);
		f.add(panel4);
// boutons de connecter et creer un compte
		JButton button1= new JButton("Creer un compte");
		JButton button2= new JButton("Se Connecter");
		button1.setFont(font2);
		button2.setFont(font2);
		Dimension dimension2=new Dimension(1000,40);
		button1.setPreferredSize(dimension2);
		button2.setPreferredSize(dimension2);
		panel5.add(button1);
		panel6.add(button2);
		panel5.setBounds(80,370,150,400);
		panel6.setBounds(330,370,150,400);
		f.add(panel5);
		f.add(panel6);
		
//transparent
		panel1.setOpaque(false);
		panel2.setOpaque(false);
		panel3.setOpaque(false);
		panel4.setOpaque(false);
		panel5.setOpaque(false);
		panel6.setOpaque(false);
		
		f.add(jLable);

// set cannot change la taille de la fenetre
		f.setResizable(false);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//click le button connecter et changer l'interface
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				new Menu(name);
			
			}
		});				
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
package vue;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;


public class Menu extends JFrame {
	JTabbedPane tabpane;
	public Menu(String name) {
		// TODO Auto-generated constructor stub
		setTitle("gestion d'une vidéothèque");
		setSize(1000, 800);
		setLocationRelativeTo(null);
		Toolkit t =Toolkit.getDefaultToolkit();
		Image img = t.getImage("src\\vue\\sign.jpg");
		this.setIconImage(img);
		
		Icon i = new ImageIcon("src\\vue\\background5.jpg");
		JLabel jLabel = new JLabel(i);
		jLabel.setBounds(0, 0, 1000, 800);
		
		
		
		Container c = getContentPane();
		tabpane = new JTabbedPane(JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT);
		c.add(tabpane, BorderLayout.CENTER);
		
		
		tabpane.setFont(new Font("Arial",Font.BOLD,18));
		tabpane.setBackground(Color.pink);
		
		/*Main menu */
		Welcome mm = new 	Welcome();
		tabpane.addTab("Welcome",mm.panel);
		
		/*Produit interface*/
		Produit p = new Produit();
		tabpane.addTab("Produit", p.laypane);
		
		
		/*  interface commande */
		Commande cm = new Commande();
		tabpane.addTab("Commande", cm.laypane1);


		/*gestion des clients*/
		UserManage um = new UserManage();
		tabpane.addTab("Gestion client", um.panel);
		


		///*quitter*/
		//mm.button.addActionListener(new ActionListener() {
		//	
//			@Override
//			public void actionPerformed(ActionEvent e) {
//			}
		//});

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

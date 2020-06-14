package vue;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;



public class Commande extends JFrame{
	

	public JLayeredPane laypane1 = new JLayeredPane();
	private DefaultTableModel model;
	DefaultTableModel model1;
	
	

	
	public void setModel(DefaultTableModel model1) {
		this.model1 = model1;
	}
	
	public Commande()  {
		
		/*
		 * 查询图书
		 */
		Font font1 = new Font("Arial",Font.BOLD,13);
	
		
		
		//改变窗口图标
		Toolkit tool = Toolkit.getDefaultToolkit();
		Image img = tool.getImage("src\\vue\\sign.jpg");
		this.setIconImage(img);
		
		/*设置窗口背景图案*/
		Icon i = new ImageIcon("src\\vue\\background5.jpg");
		JLabel label = new JLabel(i);
		label.setBounds(0, 0, 1000, 800);
		
		
		/*面板3中的标签*/
		Font font = new Font("Arial",Font.BOLD,20);
		JLabel lab3 = new JLabel("Rechercher par");
		lab3.setFont(font);
		lab3.setForeground(Color.WHITE);
		lab3.setBounds(140, 60, 600, 30);
		
		
		/*面板3中的查询下拉框*/
		Dimension dimension = new Dimension(220,30);
		JComboBox<String> j = new JComboBox<>();
		j.setSize(dimension);
		j.addItem("identifiant");
		j.addItem("date de création");
		j.addItem("réduction");
		j.setBounds(140, 100,220, 30);
		j.setBackground(Color.pink );
		j.setFont(font1);
		
		
		/*面板3中的搜索框*/
		JTextField text3 = new JTextField();
		Dimension dimension1 = new Dimension(270,30);
		text3.setFont(font1);
		text3.setSize(dimension1);
		text3.setBackground(Color.pink);
		text3.setBounds(390,100, 270, 30);
		
		/*按钮*/
		JButton button = new JButton("Recherche");
		button.setBackground(Color.pink);
		button.setBounds(670, 100, 120, 30);
		button.setFont(font1);
		
		/*新建表格*/
		model = new DefaultTableModel();
		model.addColumn("identifiant", new Vector<Integer>());
		model.addColumn("date-de-création",new Vector<String>());
		model.addColumn("réduction",new Vector<String>());
		JTable table = new JTable(model);
		
		JScrollPane jp = new JScrollPane(table);
		jp.setBounds(100, 150, 750, 450);
		
		
		/*使单元格中的内容居中*/
		DefaultTableCellRenderer renderer=new DefaultTableCellRenderer();
		renderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
		table.setDefaultRenderer(Object.class, renderer);
		
	
		
		
		JButton button1 = new JButton("ajouter une commande");
		JButton button2 = new JButton("ajouter un emprunt");
		JButton button3 = new JButton("supprimer un emprunt");
		JButton button4 = new JButton("calculer montant total ");
		
		button1.setFont(font1);
		button2.setFont(font1);
		button3.setFont(font1);
		button4.setFont(font1);
		
		button1.setBackground(Color.pink);
		button1.setBounds(30, 630, 200, 40);
		button2.setBackground(Color.pink);
		button2.setBounds(250,630, 200, 40);
		button3.setBackground(Color.pink);
		button3.setBounds(470,630, 200, 40);
		button4.setBackground(Color.pink);
		button4.setBounds(690,630, 200, 40);
		
		/*把组件放在分层窗格里*/
		laypane1.add(label, new Integer(0),0);
		laypane1.add(lab3,new Integer(150),1);
		laypane1.add(j,new Integer(100),2);
		laypane1.add(text3,new Integer(100),3);
		laypane1.add(button, new Integer(100),4);
		laypane1.add(jp, new Integer(200), 5);
		laypane1.add(button1, new Integer(630),6);
		laypane1.add(button2, new Integer(630),7);
		laypane1.add(button3, new Integer(630),8);
		laypane1.add(button4, new Integer(630),9);
		

		
		
		label.setOpaque(false);
		laypane1.setOpaque(false);
		
		text3.setOpaque(false);
	} 
	
}

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
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;



public class Produit extends JFrame{
	
	
	JLayeredPane laypane = new JLayeredPane();
	private DefaultTableModel model;
	
	private JCheckBox box;
	
	private int selectcolumn;
	public int bookid;//id d'un livre
	public Date borrowtime;
	private String borrower;//personne qui borrow
	public String lend;//si ce livre est dans la bibliotheque
	public String bookname;//书名
	DefaultTableModel model1;
	private String borroww;
	private String returnn;
	
	public void setName(String name) {
		this.borrower = name;
		
	}
	
	public void setModel(DefaultTableModel model1) {
		this.model1 = model1;
	}
	
	public Produit()  {
		
		/*
		 * 查询图书
		 */
		Font font1 = new Font("Arial",Font.BOLD,13);
		Font font2 = new Font("Arial",Font.BOLD,20);
		
		
		//改变窗口图标
		Toolkit tool = Toolkit.getDefaultToolkit();
		Image img = tool.getImage("src\\vue\\sign.jpg");
		this.setIconImage(img);
		
		/*设置窗口背景图案*/
		Icon i=new ImageIcon("src\\vue\\background5.jpg");
		JLabel label = new JLabel(i);
		label.setBounds(0, 0, 1000, 800);
		
		
		/*面板3中的标签*/
		Font font = new Font("Arial",Font.BOLD,20);
		JLabel lab3 = new JLabel("Choisir la façon de recherche");
		lab3.setFont(font);
		lab3.setForeground(Color.WHITE);
		lab3.setBounds(140, 60, 600, 30);
		
		
		/*面板3中的查询下拉框*/
		Dimension dimension = new Dimension(220,30);
		JComboBox<String> j = new JComboBox<>();
		j.setSize(dimension);
		j.addItem("Par indentifiant");
		j.addItem("Par titre");
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
		JButton button = new JButton("Rechercher");
		button.setBackground(Color.pink);
		button.setBounds(670, 100, 120, 30);
		button.setFont(font2);
		
		/*新建表格*/
		model = new DefaultTableModel();
		model.addColumn("id", new Vector<Integer>());
		model.addColumn("titre",new Vector<String>());
		model.addColumn("tarif par jour",new Vector<String>());
		model.addColumn("auteur",new Vector<String>());
		model.addColumn("langue", new Vector<String>());
		model.addColumn("Annee(sortie)", new Vector<String>());
		model.addColumn("Realisateur", new Vector<String>());
		model.addColumn("quantité", new Vector<String>());
		JTable table = new JTable(model);
		
		JScrollPane jp = new JScrollPane(table);
		jp.setBounds(30, 150, 930, 450);

		
		JTableHeader head = table.getTableHeader();//创建表格表头对象
		head.setPreferredSize(new Dimension(head.getWidth(),35));//设置表头框框大小
		head.setFont(new Font("Arial",Font.BOLD,15));//设置表格字体
		table.setRowHeight(30);//设置表格行宽
		table.setFont(new Font("Arial",Font.ROMAN_BASELINE,13));//设置表格行中字体大小
		

		
		
		
		
		/*使单元格中的内容居中*/
		DefaultTableCellRenderer renderer=new DefaultTableCellRenderer();
		renderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
		table.setDefaultRenderer(Object.class, renderer);
		
		/*添加复选框*/
		table.getColumnModel().getColumn(4).setCellRenderer(new TableCellRenderer() {
			
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, 
					boolean isSelected, boolean hasFocus,int row, int column) {
				/*定义复选框*/
				box = new JCheckBox();
				/*使具有焦点的行对应的复选框被选中*/
				box.setSelected(isSelected);
				
				/*使复选框在表格中居中*/
				box.setHorizontalAlignment((int)0.5f);
				return box;
			}
		});
		
		
		
		JButton button1 = new JButton("Ajouter");
		JButton button2 = new JButton("Supprimer");
		button1.setFont(font2);
		button2.setFont(font2);
		button1.setBackground(Color.pink);
		button1.setBounds(240, 630, 170, 40);
		button2.setBackground(Color.pink);
		button2.setBounds(520,630, 170, 40);
		
		/*把组件放在分层窗格里*/
		laypane.add(label, new Integer(0),0);
		laypane.add(lab3,new Integer(150),1);
		laypane.add(j,new Integer(100),2);
		laypane.add(text3,new Integer(100),3);
		laypane.add(button, new Integer(100),4);
		laypane.add(jp, new Integer(200), 5);
		laypane.add(button1, new Integer(630),6);
		laypane.add(button2, new Integer(630),7);
		
		
		
		
		borroww = "emprunter";
		returnn = "retourner";
		
		
		
			
		
		
		label.setOpaque(false);
		laypane.setOpaque(false);
		
		text3.setOpaque(false);
	} 
	
}

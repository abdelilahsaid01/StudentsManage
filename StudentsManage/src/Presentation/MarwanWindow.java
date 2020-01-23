package Presentation;
import Control.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;

import Control.Marwan;

public class MarwanWindow extends JFrame {
    
	public Connection cnx;
	public Statement  st ;
	public ResultSet rset;
	
	
	public JTextField lab1 ;
	public JTextField lab2;
	       JButton ok ;
	       JButton sup;
	       JButton add;
	       JButton Bye ;
	public  JLabel msg = new JLabel();
	public JLabel mm ;
	  JLabel log ;
	  JLabel pw ;
	
	  public JLabel p ;
	  ImageIcon imgicon ;
	  Image img ;
	  
	  // constructor 
     public MarwanWindow () {
    		
    	 
		 
    		
    		setTitle("Authentification ");
    		// creation 
    		 
    		add=new JButton("Sign up");
    		
    		
    		try {
		          
		          ImageIcon imageIcon = new ImageIcon("C:/icon/add-group.png"); // load the image to a imageIcon
		          Image image = imageIcon.getImage(); // transform it 
		          Image newimg = image.getScaledInstance(60, 23,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		          imageIcon = new ImageIcon(newimg);  // transform it back
         add = new JButton(imageIcon);
      

} catch (Exception ex) {
		        System.out.println(ex);
		      }
    		sup = new JButton("Delete");
    		try {
		          
		          ImageIcon imageIcon = new ImageIcon("C:/icon/rubbish.png"); // load the image to a imageIcon
		          Image image = imageIcon.getImage(); // transform it 
		          Image newimg = image.getScaledInstance(60, 23,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		          imageIcon = new ImageIcon(newimg);  // transform it back
           sup = new JButton(imageIcon);
        

} catch (Exception ex) {
		        System.out.println(ex);
		      }
    		
    		
    		ok = new JButton("Sign in");
    		lab1 = new JTextField("Tape Your Login");
    		
    		lab2= new JTextField ("Tape Your Password");
    		try {
		          
		          ImageIcon imageIcon = new ImageIcon("C:/icon/okk.png"); // load the image to a imageIcon
		          Image image = imageIcon.getImage(); // transform it 
		          Image newimg = image.getScaledInstance(90, 30,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		          imageIcon = new ImageIcon(newimg);  // transform it back
             ok = new JButton(imageIcon);
          

} catch (Exception ex) {
		        System.out.println(ex);
		      }
    		
    		
    		Bye = new JButton ("Exit");
			try {
		          
		          ImageIcon imageIcon1 = new ImageIcon("C:/icon/logout.png"); // load the image to a imageIcon
		          Image image = imageIcon1.getImage(); // transform it 
		          Image newimg = image.getScaledInstance(60, 20,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		          imageIcon1 = new ImageIcon(newimg);  // transform it back
                   Bye= new JButton(imageIcon1);
          

} catch (Exception ex) {
		        System.out.println(ex);
		      }
    		log = new JLabel("Login");
    		pw = new JLabel("Password");
    		
    		getContentPane().setLayout(null);
    		
    		JMenuBar bar = new JMenuBar ();
    		
    		JMenu test1 = new JMenu ("File");
    		JMenu test2 = new JMenu ("Edit");
    		JMenu test3 = new JMenu ("Source");
    		JMenu test4 = new JMenu ("Navigate");
    		JMenu test5 = new JMenu ("Search");
    		JMenu test6 = new JMenu ("Project");
    		JMenu test7 = new JMenu ("Run");
    		JMenu test8 = new JMenu ("Window");
    		JMenu test9 = new JMenu ("Help");
    		JMenu subMenu = new JMenu ("Open File") ;
    		JMenu item11 = new JMenu ("Last Files");
    		
    		
    		
    		JMenuItem item12 = new JMenuItem("Export");
    		JMenuItem item13 = new JMenuItem("Import");
    		JMenuItem item2 =  new JMenuItem ("Save ");
    		JMenuItem item3 =  new JMenuItem ("Exit");
    		JMenuItem item4 =  new JMenuItem ("Manuel");
    		JMenuItem item5 =  new JMenuItem ("Online Search");
    		
    		JMenu item111 = new JMenu ("Pharmacy ");
    		JMenuItem item1111 = new JMenuItem(" Rabat");
    		JMenuItem item1112 = new JMenuItem(" Sale ");
    		JMenuItem item1113 = new JMenuItem(" Casa");
    		
    		JMenuItem item112 = new JMenuItem("Hotel");
    		JMenuItem item113 = new JMenuItem("Governement");
    		
    		// configuration
    		
    		item111.add(item1111); item111.add(item1112); item111.add(item1113);

    		
    		item11.add(item111);item11.add(item112);item11.add(item113);

    		subMenu.add(item11);subMenu.add(item12);subMenu.add(item13);

    		test1.add(subMenu);
    		test1.add(item2);
    		test1.add(item3);
    		test2.add(item4);
    		test2.add(item5);
    		bar.add(test1);
    		bar.add(test2);
    		bar.add(test3);bar.add(test4);bar.add(test5);bar.add(test6);bar.add(test7);bar.add(test8);bar.add(test9);
    		
    		sup.setBounds(170, 300, 100, 30);
    		ok.setBounds(320, 300, 90, 30);
    		Bye.setBounds(450, 300, 90, 30);
    		add.setBounds(30, 300, 90,30);
    		
    		log.setBounds(100, 5, 150, 150);
    		
    		lab1.setBounds(250, 70, 150, 25);
    		
    		pw.setBounds(100, 130, 150, 50);
    		
    		lab2.setBounds(250, 145, 150, 25);

    		lab1.setBackground(Color.green);
    		log.setBackground(Color.green);
    		
    		setBounds(500, 100, 600, 450);
    		getContentPane().setBackground(Color.LIGHT_GRAY);		
    	
    		
    		getContentPane().add(lab1);
    		getContentPane().add(log);
    		
    		getContentPane().add(lab2);
    		getContentPane().add(pw);
    		getContentPane().add(msg);
    		
    		getContentPane().add(ok);
    		getContentPane().add(sup);
    		getContentPane().add(Bye);
    		getContentPane().add(add);
             JRadioButton f= new JRadioButton ("Femme");
             JRadioButton h= new JRadioButton ("Homme");
             ButtonGroup mygroup = new ButtonGroup();
             mygroup.add(f);
             mygroup.add(h);
             getContentPane().add(f);
             getContentPane().add(h);
             f.setBounds(450, 70, 100, 30);
             h.setBounds(450, 130, 100, 30);
             
             JCheckBox bx = new JCheckBox("Remember me");
             bx.setSelected(false);
             bx.setBounds(450, 200, 120, 30);

             getContentPane().add(bx);
            // getContentPane().setBackground(Color.lightGray);
            
            
            
             /*img = getImage(getCodeBase(),"C:/icon/hf.jpg");
             imgicon = new ImageIcon (img);
             JLabel b = new JLabel(imgicon);
             b.setBounds(0, 0, 600, 450); 
             this.add(b);*/
           
           
            		 
            	
            
            	 ok.addActionListener(new Marwan(this));
            	 
            	 sup.addActionListener(new Msup (this));
            	 
            	 Bye.addActionListener(new Exit());
            	 
            	 
            	 add.addActionListener(new Majouter (this));
                 
            	 lab1.addMouseListener(new Mousee (this));
            	 lab2.addMouseListener(new Mousee2 (this));
                 setJMenuBar(bar);
                 
    		
    		
    		setVisible(true);
    		setResizable(false);
    		System.out.println(lab1.getText()+lab2.getText());
    		
    		}
    		
    	}
    	
    
   

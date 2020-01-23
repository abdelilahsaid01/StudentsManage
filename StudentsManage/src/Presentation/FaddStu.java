package Presentation;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.imageio.ImageIO;
import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Control.*;
public class FaddStu extends JFrame {

	
	
	  public JTextField la1 ;
		public JTextField la2;
		public JTextField la3;
		public JTextField la4;
		    public    JButton okk ;
		    public Image  img;
		    public  JButton Bye ;
		      JLabel name ;
			  JLabel prenom;
			  JLabel note ;
			  JLabel moyen;
		public  JLabel ms = new JLabel();
		
		  JLabel log ;
		  JLabel pw ;
	  public Connection cnx;
		public Statement  st ;
		public ResultSet rset;
		
		
	
		 public FaddStu () {
			 
			 setTitle("Add Student");
				okk = new JButton("Add Student");
				//JButton okk = new sJButton(" ", new ImageIcon("C:\icon\okk.png"));  
				try {
			          
			          ImageIcon imageIcon = new ImageIcon("C:/icon/plus.png"); // load the image to a imageIcon
			          Image image = imageIcon.getImage(); // transform it 
			          Image newimg = image.getScaledInstance(60, 30,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
			          imageIcon = new ImageIcon(newimg);  // transform it back
                   okk = new JButton(imageIcon);
                

} catch (Exception ex) {
			        System.out.println(ex);
			      }
				Bye = new JButton ("Exit");
				try {
			          
			          ImageIcon imageIcon1 = new ImageIcon("C:/icon/logout.png"); // load the image to a imageIcon
			          Image image = imageIcon1.getImage(); // transform it 
			          Image newimg = image.getScaledInstance(50, 20,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
			          imageIcon1 = new ImageIcon(newimg);  // transform it back
                       Bye= new JButton(imageIcon1);
              

} catch (Exception ex) {
			        System.out.println(ex);
			      }
				la1 = new JTextField();
				la2= new JTextField ();
				la3= new JTextField ();
				la4= new JTextField ();
				
				name = new JLabel("name");
				prenom = new JLabel("prenom");
				note = new JLabel("note");
				moyen = new JLabel("moyen");
				getContentPane().setLayout(null);
				
				JMenuBar bar = new JMenuBar ();
				
				Bye.setBounds(450, 300, 90, 30);
				
				name.setBounds(100, 5, 150, 150);
				la1.setBounds(250, 70, 150, 25);
				
				prenom.setBounds(100, 130, 150, 50);
				la2.setBounds(250, 145, 150, 25);
				
				note.setBounds(100, 200, 150, 50);
				la3.setBounds(250, 215, 150, 25);
				
				moyen.setBounds(100, 280, 150, 50);
				la4.setBounds(250, 295, 150, 25);
				
				okk.setBounds(320, 350, 90, 30);
				
			
				Bye.setBounds(450, 350, 90, 30);
				
				setBounds(500, 100, 600, 450);
				
		        
				JPanel p = new JPanel ();
				p= (JPanel) getContentPane();
				
				
				getContentPane().add(name);
				p.add(prenom);
				p.add(note);
				
				p.add(moyen);
				getContentPane().add(la1);
				getContentPane().add(la2);
				
				p.add(la3);
				p.add(la4);
				p.add(okk);
				p.add(Bye);
				
				okk.addActionListener(new AjouStu (this));
				Bye.addActionListener(new Exit());
				setVisible(true);
			}
		 
		 
		 
		 
		 
		}


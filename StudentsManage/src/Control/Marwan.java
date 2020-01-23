package Control;
import Presentation.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Marwan   implements ActionListener {
	
	  MarwanWindow s;
	  
		    
		    
		public  JLabel msg = new JLabel();
		
		  JLabel log ;
		  JLabel pw ;
	  public Connection cnx;
		public Statement  st ;
		public ResultSet rset;
		
	@Override
	public void actionPerformed(ActionEvent e){
		// TODO Auto-generated method stub
	
		     connecter();//methode pour connecter au bases de donnes
		
			
			String c =s.lab1.getText();
			String cc =s.lab2.getText();
			System.out.println(c +"\t "+cc+"\t");
			  try {
				  Statement st = cnx.createStatement();
				  
			 rset = st.executeQuery("select password from authenti where login='"+c+"'");
			if(rset.next()) {
				 if (rset.getString("password").equals(cc)) {
				
				  s.msg.setText("login Success");
				  s.msg.setForeground(Color.BLACK);
				  s.hide();
				  FaddStu eee = new FaddStu ();}
				  

				  
					//System.out.println(ch);}
			 
			   else {
				 s.msg.setText("Password incorrect");
				 s.msg.setForeground(Color.RED);
				  }}
			   
				 else {
					 s.msg.setText("Login not found");
					 s.msg.setForeground(Color.BLUE);
					  }
			
			  }
			 		 /*where login='"+s.lab1.getText()+"')");*/
			 //System.out.println("Query works well");
			
			
		
			  catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("Query deosn't works");
			e1.printStackTrace();
		}
			  
			  
			  
			
	}
	
	public  Marwan (MarwanWindow e) {
				 s = e ;   
				 
			}
	
	public void connecter() {
		
		// chargement et connection****************************************************** 
		
				String chaine ="jdbc:mysql://localhost:3306/authentification";
				 try {
					 Class.forName("com.mysql.cj.jdbc.Driver");
					 System.out.println("Chargement avec succes ");
				 } catch (ClassNotFoundException e1) {
					 System.out.println("Probleme driver");

					 e1.printStackTrace();
				 }
					try {
						cnx=(Connection) DriverManager.getConnection(chaine, "root","");
						System.out.println("Cnx avec succes");
					}
					catch(SQLException e1) {
						System.out.println("pb de cnx");
						e1.printStackTrace();}
					
				//fin du chargement et de connection**********************************************
		
		
	}
}
	
	
		
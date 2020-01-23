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

public class Msup  implements ActionListener {
	 
	  MarwanWindow s;
	  public Connection cnx;
		public Statement  st ;
		public ResultSet rset;
		
	@Override
	public void actionPerformed(ActionEvent e){
		// TODO Auto-generated method stub
		
		
		
		
		//System.out.println(codee);
		     connecter();//methode pour connecter au bases de donnes
			
			
	
			  try {
				  st=cnx.createStatement();
					int  i = st.executeUpdate("DELETE FROM authenti  WHERE  login='"+s.lab1.getText()+"'"); //supprimer les lignes des tables 

			 		 /*where login='"+s.lab1.getText()+"')");*/
					
				
			
			System.out.println("Query works well  "+ i + "  "+ s.lab1.getText());
			s.msg.setText("Suppression success");
			s.msg.setForeground(Color.GREEN);	
			
			
		} 
			  catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("Query deosn't works");
			s.msg.setText("Failed Suppression"); 
	         s.msg.setForeground(Color.RED);
			e1.printStackTrace();
		}
  			 
			
			
			
			
			
	}
	
	public  Msup (MarwanWindow e) {
				 s = e ;      
			}
	
	public void connecter() {
		
		// chargement et connection****************************************************** 
		
				String chaine ="jdbc:mysql://localhost:3306/authentification";
				 try {
					 Class.forName("com.mysql.jdbc.Driver");
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
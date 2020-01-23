package Entities;
import java.sql.*;
public class My {
	
	Connection con;
	
	Statement  state ;
	
	ResultSet rset;
	

	public My() {
		
		
		
	}
	
	public void  myEtudiantDao() throws ClassNotFoundException, SQLException {
		 {
		
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("System loaded");
            
            con =DriverManager.getConnection("jdbc:mysql//localhost:3306/myetudiantdao","root","");
            System.out.println("database connected");
            
            state = con.createStatement();
          
             //int rset = state.executeUpdate("insert into table etudiantdao1 ('nawram+'marwan'+1+15+10)");
            
         		
            	
           // con.close();
            
	}
	

}
}
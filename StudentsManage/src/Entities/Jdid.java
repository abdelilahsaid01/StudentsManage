package Entities;
import java.sql.*;
import java.util.Scanner;


public class Jdid {

	Scanner  sc = new Scanner(System.in);
	
    Connection con;
	
	Statement  state ;
	
	ResultSet rset;
	
	
	public Jdid() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("DRiver loaded");
		} catch (ClassNotFoundException e) {
			System.out.println("PB in laoding");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		try {
			con = DriverManager.getConnection("jdbc:mysql//locahost 3306//myetudiantdao","root","");
			System.out.println("Connection established");
		} catch (SQLException e) {
			System.out.println("Connection PB");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  void addetudiant(Etudiant b) {
	
		
		try {
			state = con.createStatement();
			rset = state.executeQuery("insert into  myetudiantdao values ('"+b.nom+"'+'"+b.prenom+"'+'"+b.cne+"'+'"+b.note+"'+'"+b.moyennote+"')");
		} catch (SQLException e) {
			System.out.println("Statement PPB");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	
	
	
	public  void modifier() {
		int code;
		double notefinale;
		System.out.println("entrer votre CNE");
		code=sc.nextInt();
		System.out.println("entrer votre nouvelle note");
		notefinale=sc.nextDouble();
		try {
			int  rset = state.executeUpdate("update  myetudiantdao  set note="+notefinale+ "where cne="+code );
			System.out.println("goood update");
		} catch (SQLException e) {
			System.out.println("PB update");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
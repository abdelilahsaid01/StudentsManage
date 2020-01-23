package Entities;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import Traitement.Gestionetudiant;

public class EtudiantDao {
	//creer une cnx (lien) vers une base de donnees
	
	Scanner  sc = new Scanner(System.in);
	Connection cnx;
	// pour envoyer  et exécuter des requetes sql
	Statement  st ;
	// recuperation des resultats
	ResultSet rset;
	
public EtudiantDao() {
		
		String chaine ="jdbc:mysql://localhost:3306/etudiantdao";
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
		 }
	public void addEtudiant(Etudiant y) {
		
		
		try {
		st=(Statement) cnx.createStatement();
		
		
		int  i = st.executeUpdate("insert into etudiantdao  (nom,prenom,note) values ('"+y.nom+"','"+y.prenom+"','"+y.note+"')");
		}
		
		catch (SQLException e1) {
			System.out.println("pb d'enregistrement");
			e1.printStackTrace();

		}
	}
	
	
	public void modifier() {
		
		
		String code;
		Double  notej;
		System.out.println("Saisir le CNE d'etudiant ");
		code=sc.next();
		System.out.println("Saisir la nouvelle note");
		notej=sc.nextDouble();
		
		 try {
			st=(Statement) cnx.createStatement();
			
			
			int  i = st.executeUpdate("update  etudiantdao set note="+notej+ "where cne="+code);
			//int  i = st.executeUpdate("delete from   etudiantdao where  cne="+code); supprimer les lignes des tables 

			System.out.println("modification avec succes ");
			}
		 
			catch (SQLException e1) {
		

			{
				System.out.println("pb de modification");
				e1.printStackTrace();

			}
		
		
	}
	}
public void supprimer() {
		
		
		String code;
		Double  notej;
		System.out.println("Saisir le CNE d'etudiant a supprimer ");
		code=sc.next();
		
		
		 try {
			st=(Statement) cnx.createStatement();
			
			
			
			int  i = st.executeUpdate("delete   from   etudiantdao where  cne="+code); //supprimer les lignes des tables 

			System.out.println("suppression avec succes ");
			}
		 
			catch (SQLException e1) {
		

			{
				System.out.println("pb de suppression");
				e1.printStackTrace();

			}
		
		
	}
	}

public void afficher() throws ClassNotFoundException, SQLException {
	
	
	System.out.println("Affichage des tables ");
	
	   st=cnx.createStatement();
		rset=st.executeQuery("select * from etudiantdao");
		
		while(rset.next()) 
		System.out.println(rset.getInt(1)+" \t"+ rset.getString(2)+" \t "+rset.getString(3)+ "\t "+rset.getDouble(4)+" \t");	
}
}


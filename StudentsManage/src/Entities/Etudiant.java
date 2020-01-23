package Entities;

import java.util.Vector;

public class Etudiant {

   


		 public String nom;
		 public String prenom;
		 public int cne ;
		 public double  note;
public static double moyennote;
public Etudiant () {	
	

}
	 


public Etudiant (Vector vector) {	
		
		nom = "azaz";
		prenom = "zeerer";
		cne=1254;
		note=0;
		
		
	}
	 
	 public void  imprimer() {//declaration premiere de la methode imprimer overloading
		 
		 System.out.println("bonjour tout le monde ");
		 
	 }
	 
public void  imprimer(String d) {
		 
		 System.out.println("bonjour Mr  "+d);
		 
	 }
}


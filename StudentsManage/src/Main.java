import java.sql.SQLException;

import Entities.*;
import Traitement.Gestionetudiant;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	  {
		// TODO Auto-generated method stub

	//Gestionetudiant v = new Gestionetudiant();
		//v.addstudent();
		//Gestionetudiant gestion = new Gestionetudiant();
		
		//gestion.addstudent();
		//System.out.println(gestion.calculermoyen(gestion.addstudent()));
		
		//System.out.print(gestion.calculermoyen(gestion.addstudent(null)));
		/*Eleve eleve = new Eleve ();
		eleve.imprimer();
		eleve.imprimer("marwan");
      Etudiant etudiant = new Etudiant ();
        etudiant.imprimer();
      etudiant.imprimer("adil");
    Stagiaire stagiaire = new Stagiaire();
   stagiaire.imprimer();
    stagiaire.imprimer("julio");*/
		
		/*EtudiantDao e = new EtudiantDao();
		
	    e.modifier();*/
	
		Gestionetudiant gestion = new Gestionetudiant();
	    gestion.addstudent1();
		
		/*My a = new My () ;
		try {
			a.myEtudiantDao();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}

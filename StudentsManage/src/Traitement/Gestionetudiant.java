package Traitement;
import Entities.*;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

public class Gestionetudiant {

	Scanner  sc = new Scanner(System.in);

	 public Vector v  = new Vector() ;
	
	 EtudiantDao y = new EtudiantDao();
	 
	
	 //Jdid a = new Jdid () ;
    public void addstudent1() throws ClassNotFoundException, SQLException {
    	System.out.println("choisir 1 pour Ajouter , 2 pour Modifier , 3 supprimer une ligne , 4 afficher un tableau");
    	while(true) {
   		 
   		 int i =sc.nextInt();
   		 
   		 if (i==1) 
   			addstudent();
   		 if (i==2)
   			y.modifier();
   		if (i==3)
   			y.supprimer();
    	
        if(i==4)
        	y.afficher();
         System.out.println("choisir pour Quitter o/n");
   		     if(sc.next().equalsIgnoreCase("o"))
   		    	 
   		          addstudent1();}
   		 
   	 }
	
    	public Vector addstudent() {
    	while(true) {
    		
    	
    	//Etudiant x = new Etudiant();
    	Etudiant b = new Etudiant ();
    	
    	
    	System.out.println("Saisir votre NOM ");
        b.nom=sc.next();
        
    	System.out.println("Saisir votre PRENOM ");
        b.prenom=sc.next();
        
        
        
        System.out.println("Saisir votre NOTE ");
        b.note=sc.nextDouble();
        
        
        y.addEtudiant(b);
        //a.addetudiant(b);
        v.add(b);
       
        System.out.println("Etudiant ajouter avec Succés");
        
        System.out.println("Quitter o/n");
        
        if(sc.next().equalsIgnoreCase("o"))      break ;
        }
    	//System.out.println(v);
        //System.out.println("   Nom    !   Prenom  !   CNE  !   Note   ");
        
  /*for(int i=0;i<v.size();i++) {
	  Etudiant x = new Etudiant(v);
	  x =(Etudiant)v.get(i);
      System.out.println(x.cne+"     "+x.nom+"     "+x.prenom+"     "+x.note+"     ");
}*/  	 
  return v;
}   
 public Vector addstudent(Eleve eleve) {//overloading

    	
    	while(true) {
    	
    	Eleve x = new Eleve();
    	
    	System.out.println("Saisir votre NOM ");
        x.nom=sc.next();
        
    	System.out.println("Saisir votre PRENOM ");
        x.prenom=sc.next();
        
        System.out.println("Saisir votre CNE ");
        x.cne=sc.nextInt();
        
        System.out.println("Saisir votre NOTE ");
        x.note=sc.nextDouble();
        
        System.out.println("Saisir nom pere ");
        x.pere=sc.next();
        
        v.add(x);
        
        System.out.println("Eleve ajouter avec Succés");
        
        System.out.println("Quitter o/n");
        
        if(sc.next().equalsIgnoreCase("o"))      break ;
        }
    	System.out.println(v);
        System.out.println("   Nom    !   Prenom  !   CNE  !   Note   ! Pere !");
        
  for(int i=0;i<v.size();i++) {
	  Eleve y = new Eleve();
	  y =(Eleve)v.get(i);
      System.out.println(y.nom+"     "+y.prenom+"     "+y.cne+"     "+y.note+"     "+y.pere);
}    	 
  return v;
}   
    public double calculermoyen(Vector<Etudiant> v) {
    	double moyen = 0 ;
    	int  a = v.size();
    	for ( int i = 0;i< a;i++) {
    		 moyen = v.get(i).note + moyen;
    	 
    	 //Etudiant.moyennote=moyen;
    }
    	
    	System.out.println(moyen);
		return  moyen/v.size();
}
    
    
    
    
    	
    	
    
}
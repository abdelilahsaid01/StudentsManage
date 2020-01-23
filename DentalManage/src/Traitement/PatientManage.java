package Traitement;

import Entities.PatientStar;
import Entities.Toothcare;
import java.util.Scanner;
import java.util.Vector;

public class PatientManage {

	Scanner  sc = new Scanner(System.in);

	 public Vector v  = new Vector() ;
	 
	 public Vector AddPatient() {
		 while (true) {
	Toothcare x = new  Toothcare();
	System.out.println("Saisir votre NOM ");
    x.nom=sc.next();
    
	System.out.println("Saisir votre PRENOM ");
    x.prenom=sc.next();
    
    System.out.println("Saisir votre Patient_ID ");
    x.patient_ID=sc.nextInt();
    
    System.out.println("Saisir votre TEL ");
    x.tel=sc.nextInt();
    
    System.out.println("Saisir votre AGE ");
    x.age=sc.nextInt();
    
    
    v.add(x);
    System.out.println("Patient ajouter avec Succés");
    
    System.out.println("Quitter o/n");
    if(sc.next().equalsIgnoreCase("o"))      break ;
	        }
	    	
	        System.out.println("   Nom    !   Prenom  !   Patient_ID  !   TEL   ");
	        
	  for(int i=0;i<v.size();i++) {
		  Toothcare y = new Toothcare();
		  y=(Toothcare)v.get(i);
		  System.out.println("   "+y.nom+"     "+y.prenom+"      "+y.patient_ID+"      "+y.tel );}
	  return v;
	}   
	 
	 
	 
	 
			 public Vector AddPatient(PatientStar star) {
				 while (true) {
			Toothcare x = new  Toothcare();
			System.out.println("Saisir votre NOM ");
		    x.nom=sc.next();
		    
			System.out.println("Saisir votre PRENOM ");
		    x.prenom=sc.next();
		    
		    System.out.println("Saisir votre Patient_ID ");
		    x.patient_ID=sc.nextInt();
		    
		    System.out.println("Saisir votre Patient_ID ");
		    x.patient_ID=sc.nextInt();
		    
		    System.out.println("Saisir votre TEL ");
		    x.tel=sc.nextInt();
		    
		    System.out.println("Saisir votre AGE ");
		    x.age=sc.nextInt();
		    
		    
		    v.add(x);
		    System.out.println("Patient ajouter avec Succés");
		    
		    System.out.println("Quitter o/n");
		    if(sc.next().equalsIgnoreCase("o"))      break ;
			        }
			    	
			        System.out.println("   Nom    !   Prenom  !   Code  !   Patient_ID  !   TEL   ");
			        
			  for(int i=0;i<v.size();i++) {
				  PatientStar y = new PatientStar();
				  y=(PatientStar)v.get(i);
				  System.out.println("   "+y.nom+"     "+y.prenom+"      "+y.code+y.patient_ID+"      "+y.tel );}
			  return v;
			}   
			 
			 
	 public double  calculcard(Vector<Toothcare> v) {
		 
	    	double  card  = 0 ;
	    	int  a = v.size();
	    	for ( int i = 0;i< a;i++) {
	    		
	    		 card = (double) (Math.random()*100 + v.get(i).patient_ID);
	    	 
	    	 
	    }
	    	
	    	
			return   card;
	}
	    
	    
	    
	    
	    	
	    	
	    
	}

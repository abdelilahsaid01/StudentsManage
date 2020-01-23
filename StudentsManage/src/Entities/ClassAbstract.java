package Entities;

import java.util.Scanner;

//final class ClassAbstract {
public abstract class ClassAbstract {
	String nom;
	String prenom;
	int cne;
	Scanner  sc = new Scanner(System.in);

	public void addstudent() {
		// TODO Auto-generated method stub
        String nom;
		System.out.println("entrer nom");
        nom=sc.next();
		this.nom=nom;
		
	}
	//final public int aire();
	abstract public int  aire();
}

package Exceptionn;

import java.util.Scanner;



public class ExcepEss {
	
	  static void methode () throws Excep {
		  Scanner  sc = new Scanner(System.in);

		    System.out.println("entrer a ");
		    int a=sc.nextInt();
		    System.out.println("entrer b ");
		    int b =sc.nextInt();
		
		if ( a==b) {
			
			throw new Excep();

		
		}
		else 
			System.out.println(a+" et "+b+" OK ! ");

		
	}
	
}

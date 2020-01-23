import java.util.*; 
import java.util.ArrayList;
import java.util.Scanner;

import java.util.stream.IntStream; 
import java.util.Scanner;

public class Chain {
	private Scanner sc;
		void test1(){
			String s1 ;
                 int k =0 ;
			sc = new Scanner (System.in);
			System.out.println("Saisir un Texte ");
	    	s1 = sc.next();
			System.out.println("Donner la lettre à chercher :");
			char c =sc.next().charAt(0);
			System.out.println("la lettre recherché est : "+c);
			System.out.println(c+"=");
			Vector x = new  Vector();
             for (int i = 0 ; i<s1.length();i++) {
            	 
            	 char temp =s1.charAt(i);
            	 while (temp==c) {
            		 k++; x.add(i);
         			
break;
            		 }
            	 

            	 
             }
        	 System.out.println(x);

 			System.out.print( c+"est repeté "+k+" fois ");

	}
}

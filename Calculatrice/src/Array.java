import java.util.ArrayList;
import java.util.Scanner;
 

public class Array {

	Scanner  sc = new Scanner(System.in);

		void arrayop() {
		ArrayList<Double> x = new  ArrayList<Double>();
		x.add(1.45);
		x.add(2.457);
		x.add(3.417);
		x.add(4.57);
		x.add(5.1425);
		
		System.out.println(x);
	}




ArrayList <Integer> arraywith() {
	ArrayList<Integer> x = new  ArrayList<Integer>();
	int b =1 ;
	while(b!=0) {
		System.out.println("saisir un element");
		x.add(sc.nextInt());
		System.out.println("Appuyer 0 pour quitter ");
        if (sc.nextInt()==0)
        	b=0;
		
	}
	System.out.println(x);
	return x ;}

	
	
	/*int finder */void finder(ArrayList<Integer> marwan) {
	System.out.println("chercher un nombre ");
	int find= sc.nextInt();

int j ,k=0;
 for (j=0;j<marwan.size();j++) {
	 
 
	 if (marwan.get(j)==find) {
		 k++;
	       
 }
}
	System.out.println(" le nombre "+find+" est repeté "+k+" fois ");
  
}

}
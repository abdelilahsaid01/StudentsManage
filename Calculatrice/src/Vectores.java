import java.util.Scanner;
import java.util.Vector ;

public class Vectores {
     Scanner sc = new Scanner (System.in);
	void noteclass(){ 

	Vector v  = new Vector () ;
	String b ="n";
	while(true) {
		
		
	
	System.out.println(" Saisir Le nom");
	v.add(sc.next());
	
	System.out.println(" Saisir la note");
	v.add(sc.next());
	
	System.out.println("Appuyer o pour quitter ");
    if (sc.next().equalsIgnoreCase("o"))
    	break;
	}
	
	
	System.out.println(v);
      int max=0 ;int i ;
	for ( i = 0;i< v.size();i=i+2) {
		
		if (Integer.parseInt((String) v.get(i+1)) > max )
			max = Integer.parseInt((String) v.get(i+1));
	}
	
    System.out.println(" la note maximale est " +max);
int min = max ;
for ( i = 0;i< v.size();i=i+2) {
		
		if (Integer.parseInt((String) v.get(i+1)) < min )
			min = Integer.parseInt((String) v.get(i+1));

		
	}	
	
System.out.println(" la note minimale est " +min);
float moyen = 0 ;
for ( i = 0;i< v.size();i=i+2) {
	
	 moyen =(Float.parseFloat((String) v.get(i+1)))/(v.size()/2)+moyen ;

	
}	

System.out.println(" la moyenne est " +moyen);
System.out.println(" les notes tries : ");
int a, bc;
int temp1;
int j ;
for ( j = 0;j< v.size()-3;j++) {
	  
for ( i = 0;i< v.size()-3;i=i+2) {
  
 String temp2 ;
	a=Integer.parseInt(v.get(i+1).toString()); 
	bc= Integer.parseInt(v.get(i+3).toString());
	if ( a >  bc ){
		
		temp1 = Integer.parseInt(v.get(i+3).toString()); temp2 = v.get(i+2).toString() ;
	
		v.remove(i+3);       
		v.add(i+3,v.get(i+1).toString());

		v.remove(i+2);
		v.add(i+2,v.get(i));

		
		v.remove(i+1);                       
		v.add(i+1,temp1);  
		
		v.remove(i);
		v.add(i,temp2.toString());
}
	} }

System.out.println(v);

	}
}
 

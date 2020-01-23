import java.util.*; 
import java.util.stream.IntStream; 
import java.util.Scanner;

public class Calcul {
 
	
	
	int addition(int x,int y) {
		
		
	return x+y ;
	
}

	void fonction(int x) {
  	  
  	  if ( x%2==0) 
  		  
  			System.out.println("le nombre "+ x +" est paire");

    
  	  else 
  	  
  		  
			System.out.println("le nombre "+ x +" est impaire");
  				  }
	
	void mention(int note) {
	  	  
	  	  switch (note) { 
	  		  
	  	  case 1 : case 2 : case 3 : case 4 :case 5 : case 6 :case 7 : case 8 :case 9 : System.out.println("redoublant/e"); break ;
	  	  case 10 : case 11 :case 12  : System.out.println("Passable"); break ;
	  	  case 13 : case 14 :case 15 :System.out.println("Assez Bien"); break ;

	  	  default : System.out.println("Excellent");

	  	 

	    
	  				  }

	} 
	
	
	void testwhile(int a ,int b) {
		
		while (a>b) {
		System.out.println("hello");
	}
}

	void testwhile1(int a) {
		
		while (a>30) {
		System.out.println("hello");
		
	}}
	
	
 void testwhile2(int a) {
		int i = 0;
		while (a>30) {
		System.out.println("hello");
		i=i+1;
		if ( i==5)   break ;
		
	}
	
}
	
	void testwhile3(int a) {
		int somme=0;
		int i = 0;
		while (i<=a) {
		
		somme=somme+i ;
	    i=i+1;}
		
		System.out.println(somme);
	}
	
	
	void factoriel() {
		
		int n ; int fact=1;
		sc = new Scanner (System.in);
		System.out.print("saisir n");
    	n = sc.nextInt();
		int i =1;
		while (i<=n) {
	    fact = fact*i;
		i = i +1 ;
	    
	    
		}
		
		System.out.println(fact);
	}
	
	
	
 void ouss(int a,int n) {
		
		int ouss=1 ;
		
		int i =1;
		while (i<=n) {
	    ouss = ouss*a;
		i = i +1 ;
	    
	    
		}
		
		System.out.println(ouss);
	}

	
private Scanner sc;

void oussuser() {
		
		int ouss=1 ; int m ;int n;
		int i =1;
		sc = new Scanner (System.in);
		System.out.print("saisir m");
    	m = sc.nextInt();
    	System.out.print("saisir n");
    	n = sc.nextInt();
		while (i<=n) {
	    ouss = ouss*m;
		i = i +1 ;
	    
	    
		}
		
		System.out.println(ouss);
	}
	
void suitehar() {
		
		float i = 1 ; float h = 0; int n ;
		sc = new Scanner (System.in);
		System.out.print("saisir n");
    	n = sc.nextInt();
		
		while (i<=n) {
			
	    h = h +(1/i);
		i = i +1 ;

	    
	    
		}
		
		System.out.println(h);
	}
void somme() {
	
int a ; int b ;	int c ;
    sc = new Scanner (System.in);
	System.out.print("saisir a");
	a = sc.nextInt();
	System.out.print("saisir b");
	b = sc.nextInt();
	c= a+b ;
	
	System.out.println(c);
}
	

void triangleiso() {
	
	int  i = 0 ; 
	
    int j =0;
    System.out.print("donner combien des lignes");
	sc = new Scanner (System.in);
	int n= sc.nextInt();
	while (j<=n) {
	i = j;
   while(i<=n) {
System.out.print(" ");
	i++;
   }
   
   int z=1;
	while (z< j) {	
	
System.out.print(" *");
   z++;
	}
   j++;
   System.out.println("");
	}
	
	
	
}

void sommejusqa() {
	int somme=0; int n ;
	int i = 0;
	sc = new Scanner (System.in);
	System.out.print("saisir n");
	n = sc.nextInt();
	while (i<=n) {
	
	somme=somme+i ;
    i=i+1;}
	
	System.out.println(somme);
}

void oussfois2(int x) {
	double ouss=1 ;
	int n =10 ;
	int i =1;
	int j = 1 ;
	while (i<=n) {
    ouss = ouss*x;
	i = i +1 ;
     while (j<=n) {
    	 ouss=ouss*x;
    	 j++ ;
     }
  
	}
	System.out.println(ouss);
	

}

void ouss1(int n) {
	double ouss=1 ;
	
	int i =1;
	for (i=1;i<=n;i++) {
		if (i%2==0) {
			ouss=ouss*1 ;}
		
		else  {ouss = ouss*(-1);}
	 
    
	}
	System.out.println(ouss);
	

}
void factorielfois2() {
	
	int x ; double fact=1; int i ;
	sc = new Scanner (System.in);
	System.out.print("saisir n");
	x = sc.nextInt();
	int m = x * 2 ;
	for (i =1; i <=m; i ++) {
	
		fact= fact*i ;
		
}
	
	System.out.println(fact);
}

void trigono() {
    int n ; 
	int i ; int cos =0 ;
	sc = new Scanner (System.in);
	System.out.print("Saisir la valeur pour calculer la cosinus");
	sc = new Scanner (System.in);
    n = sc.nextInt();
	for(i=1;i<=n;i++){
		

	System.out.println(cos);
}}
void calcul() {
	
	
	
	int k = 1 ;
	while (k==1) {
		System.out.println("--*Tapez 1 pour calculer une suite harmonie");
		System.out.println("--*Tapez 2 pour calculer une suite puissance");
		System.out.println("--*Tapez 3 pour calculer une somme");
		System.out.println("--*Tapez 4 pour calculer un factoriel n!");
		System.out.println("--*Tapez 5 pour calculer une suite de sommation");
		System.out.println("--*Tapez 6 pour afficher un triangle isocele");

		sc = new Scanner (System.in);
        int m = sc.nextInt();
             switch(m) {
	
	case 1 : suitehar(); break ;
	case 2 : oussuser(); break ;
	case 3 : somme() ; break ;
	case 4 : factoriel() ; break ;
	case 5 : sommejusqa() ; break ;
	case 6 : triangleiso() ; break ;
	
	}
	System.out.print("choisir 1 pour continuer ou bien 2 pour quitter :");

	k = sc.nextInt();
	}
	
	System.out.println("le system va quitter................");

}


void triangle() {
	
	int  i,j; 
	
    System.out.print("donner combien des lignes");
	sc = new Scanner (System.in);
	int n= sc.nextInt();
	 for(i=0;i<n;i++) {
	   
   for (j=0;j<n-i;j++) {
	   
       System.out.print(" "); }
	
	   for(int k=0;k<=i;k++) { System.out.print("* ");}
	                      
       System.out.println("");
    
	    
	 }	
	 
	
}


void pyramide() {
	
	int  i,j; 
	
    System.out.print("donner combien des lignes");
	sc = new Scanner (System.in);
	int n= sc.nextInt();
	int l = 1 ;
	 for(i=0;i<n;i++) {
	   
   for (j=0;j<n-i;j++) {
	   
       System.out.print(" "); }
	
	   for(int k=0;k<l;k++) { System.out.print(l+" ");}
	                
	   System.out.println(" ");
	   l++ ;      
      
    
	    
	 }	
	 
	
}


void inversetri() {
	
	int  i,j ; 
	
    System.out.print("donner combien des lignes");
	sc = new Scanner (System.in);
	int n= sc.nextInt();
	
	 for(i=0;i<n;i++) {
	   
		 for(j=0;j<i;j++) System.out.print(" ");

       for (j=0;j<n-i;j++) {System.out.print("* "); }
       
       System.out.println();
       
	 }}
	
void star () {	
int  i,j,k ; 
    System.out.print("donner combien des lignes");
	sc = new Scanner (System.in);
	int n= sc.nextInt();
	
	 for(i=0;i<n;i++) {
	   
   for (j=0;j<n-i;j++) {
	   
       System.out.print(" "); }
	
	   for(k=0;k<i;k++) { System.out.print("* ");}
	
       System.out.println();}
    
    for(i=0;i<n;i++) {
    	   
  		 for(j=0;j<i;j++) System.out.print(" ");

         for (j=0;j<n-i;j++) {System.out.print("* "); }
         
         System.out.println();
          	 }
}

void tableau1() {	
	int i ;
    System.out.print("Donner la taile du tableau");
	sc = new Scanner (System.in);
	int n= sc.nextInt();
	int[] nombres =new int [n];
	
	 for(i=0;i<n;i++) {
		 System.out.println("donner la valeur du  case "+i);
          nombres [i] = sc.nextInt();
	     
	 }
	 for(i=0;i<n;i++) {
             System.out.print(nombres[i] + " ");}

}
void tableausupminmoyen() {	
	int i ; float max =0 ; float min ; float moyen=0 ;
    System.out.print("Donner la taile du tableau");
	sc = new Scanner (System.in);
	int n= sc.nextInt();
	float [] nombres = new float [n];
	
	 for(i=0;i<n;i++) {
		 System.out.println("donner la valeur du  case "+i);
          nombres [i] = sc.nextFloat();
	     
	 }
	 for(i=0;i<n;i++) { 
		 if (max<nombres[i])
			 max=nombres[i];}
             System.out.println(" la valuer maximale est " +max);
             min = max ;
             for(i=0;i<n;i++) { 
        		 if (min > nombres[i])
        			 min = nombres[i];}
             System.out.println(" la valuer minimale est " +min);
             for(i=0;i<n;i++) { 
            	 moyen = moyen+nombres[i]/n ;}
             System.out.println(" la valuer moyenne est " +moyen);
             }
        		




void tableautrier() {	
	 int i  , t =0 ;
	 System.out.print("Donner la taile du tableau");
		sc = new Scanner (System.in);
		int n= sc.nextInt();
		int[] nombres =new int [n];
		
		for(i=0;i<=n-1;i++) {
			 System.out.println("donner la valeur du  case "+i);
	          nombres [i] = sc.nextInt(); }
		System.out.println(" tableau non trié ");
		  for(i=0;i<n;i++) {
			 System.out.println(" " +nombres[i]);}
		for(int j=0;j<n;j++) {
		for(i =0 ; i< n-1 ; i++) {
			if ( nombres[i]>nombres[i+1]) {
				
		       t =nombres[i+1];
		     nombres[i+1]=nombres[i];
		     nombres[i]= t ;}
		 } }
		System.out.println(" tableau trié  par ordre ASCEN" );
  for(i=0;i<n;i++) {
			 System.out.println(" " +nombres[i]);}	 
  for(int j=0;j<n;j++) {
		for(i =0 ; i< n-1 ; i++) {
			if ( nombres[i]<nombres[i+1]) {
				
		       t =nombres[i+1];
		     nombres[i+1]=nombres[i];
		     nombres[i]= t ;}
		 } }
		System.out.println(" tableau trié  par ordre DESC" );
for(i=0;i<n;i++) {
			 System.out.println(" " +nombres[i]); }
  
  
}
void tableaumultip() {	
	int i ;
    System.out.print("Donner la taile des tableaux");
	sc = new Scanner (System.in);
	int n= sc.nextInt();
	int[] nombres =new int [n];
	int [] t = new int [n];
	int [] r = new int [n];
	 for(i=0;i<n;i++) {
		 System.out.println(" remplissage du tableau 1 : donner la valeur du  case "+i);
          nombres [i] = sc.nextInt();}
	 
          for(i=0;i<n;i++) {
     		 System.out.println("remplissage du tableau 2 :donner la valeur du  case "+i);
              t [i] = sc.nextInt();}
          
          for(i=0;i<n;i++) {
      		 r [i] = t[i] * nombres[i];
      		System.out.println(r[i]);
               
	 }
	 
}

void matrixopera() {	
	int i ; int j ;
    System.out.print("Donner le nombre des lignes");
	sc = new Scanner (System.in);
	int l= sc.nextInt();
	System.out.print("Donner le nombre des colomuns");
	int c= sc.nextInt();
	int [][] a = new int [l][c] ;
	int [][] b = new int [l][c] ;
	int [][] sum = new int [l][c] ;
	int [][] sous = new int [l][c] ;
	int [][] d = new int [l][c] ;
	int [][] e= new int [l][c] ;
	for (j=0;j<l;j++) {
	for(i=0;i<c;i++) {
		 System.out.println(" remplissage Matrice A : donner la valeur du  case "+i+j);
          a [j] [i]= sc.nextInt();}}
	 
	for (j=0;j<l;j++) {
		for(i=0;i<c;i++) {
			 System.out.println(" remplissage Matrice B : donner la valeur du  case "+i+j);
	          b [j] [i]= sc.nextInt();}}
	
	 System.out.println(" La Matrice A egale :");
		affichermatrice(a);
		System.out.println(" La Matrice B egale :");
		affichermatrice(b);

	for (int w = 0; w < l; w++) {
		for (int x = 0; x < c; x++) {
			sum[x][w] = a[x][w] + b[x][w];
		}
	}
	
	for (int w = 0; w < l; w++) {
		for (int x = 0; x < c; x++) {
			sous[x][w] = a[x][w] - b[x][w];
		}
	}
	
	/*for ( i = 0; i< c; i++) {
		for ( j= 0; j <c; j++) {
			d[j][i] = a[j][i] * b[j][i];
		}
	}*/
	
	for ( j =0 ;j<a.length;j++) {
		for ( i= 0; i < a[i].length; i++) {
			for ( int k = 0; k <a.length; k++) {
				d[j][i] = a[k][i] * b[k][j];
			}
		}
		}
	
	for ( int k =0 ;k<=l-1;k++) {
		for ( i = 0; i < c; i++) {
			for ( j = 0; j <c; j++) {
				e[i][j] = a[i][k] * b[k][j];
			}
		}
		}
	System.out.println(" La somme des matrices A et B egale :");
	affichermatrice(sum);
	
	System.out.println(" La soustraction des matrices A et B egale :");
	affichermatrice(sous);
	
	System.out.println(" La multiplication des matrices A et B egale :");
	affichermatrice(d);
	
	System.out.println(" La multiplication des matrices A et B egale :");
	affichermatrice(e);
}

	
	private static void affichermatrice(int[][] matrix) {
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				System.out.print(matrix[r][c] + "\t");
			}
			System.out.println();
	 
}

	}
	
	void sudoko() {	
		int i ;
	    int l=0 ; int c=0 ;
		System.out.print("Voici le Probleme du Suduko a resoudre :");
		System.out.println();
		int [][] m = {{ 0, 0, 1 },{ 0, 0, 8 },{ 0, 9, 0 }};
		 
		for ( l =0; l < 3; l++) {
	        for ( c = 0; c < 3; c++) {
	            System.out.print( m[l][c] + " ");
	        }
	        System.out.println();
	    }
		
		System.out.println("les cases remplis par les lignes  ");
		for ( int j=0 ; j < 3 ;j++ ) {
		       
			while ( m[0][j]!=0) {
	               int t = m[0][j] ;
           	System.out.print( t + " "); 
	        
	               System.out.println();}
			break ;
		                      
		 
		        
		           
		        }}}
		        
	
		           
	   			        	   
	   		           
		        
		       /* System.out.println("La solution :");
				for ( int l =0; l < 3; l++) {
			        for ( int c = 0; c < 3; c++) {
			            System.out.print( m[l][c] + " ");
			        }
			        System.out.println();}}*/
		
		
	

		
		


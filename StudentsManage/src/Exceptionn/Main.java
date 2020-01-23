package Exceptionn;

public class Main {
	
public static void main (String []args) {
		
		try {
			
			new ExcepEss ().methode();
			System.err.println("Pas d'erreur ");
		}
		
		catch ( Excep exp)
		{
			
			System.err.println("Erreur "+exp.message());
		}
		
		finally{
			 System.out.println ("Message final");
			}

		
		
	}

}

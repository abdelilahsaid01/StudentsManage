package Entities;

import java.util.Scanner;

public class CA1 extends ClassAbstract  {

	Scanner  sc = new Scanner(System.in);

	private String competition;
	private int classement ;
	private int record ;
	private int single ,mixte ;
	public void tennis (int single , int mixte) {
		System.out.println(" entrer votre classement ");
		 classement = sc.nextInt(); 
          this.record = single; 
}
	
	public int aire() {
		// TODO Auto-generated method stub
		return 0;
	}
	
 
}

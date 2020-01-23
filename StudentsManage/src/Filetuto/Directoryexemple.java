package Filetuto;

import java.io.File;
import java.util.Scanner;

public class Directoryexemple {

	public static void listefichier (File dir) {
		// TODO Auto-generated method stub
              if(dir.isDirectory()==true) {
            	  String fichiers []=dir.list();
            	  System.out.println(dir.getAbsolutePath()+":");
            	  for(int i=0;i!=fichiers.length;i++) {
            		  System.out.println("\t"+fichiers[i]);
            	  }
            	  
            	  } else { System.err.println(dir+"n'est pas un repertoire");}
              }
	
	static public void main (String args []) {
		
		
		File f = new File("c:\\xampp");
		
		listefichier(f);
	}

}

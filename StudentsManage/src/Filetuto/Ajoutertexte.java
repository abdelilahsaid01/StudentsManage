package Filetuto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ajoutertexte {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
             
		
		String chaine = "Bonjour Les GE et Les GI";
             
              //remplir un fichier .txt ^par qlqchose*************************
                try {
            FileOutputStream f =  new FileOutputStream("c:/marwan/Marwan.txt");
            	  f.write(chaine.getBytes());
            	  f.close()	;}
         catch (IOException e) {
        	 System.out.println("Erreur ecriture");
         }
            
             //lire le contenu d'un fichier********************************** 
             FileInputStream f = new  FileInputStream("c:/marwan/Marwan.txt");
             
            int  i = 0;
             while ((i=f.read())!=-1){
            System.out.print((char)i);}
             f.close();
             
             
}
}
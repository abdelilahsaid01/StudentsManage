package Filetuto;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExempleFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 //create file . exe *****************************************************
     	File monfichier = new File ("c:/icon/mm.txt");
		monfichier.createNewFile();
		System.out.println(monfichier.exists());
		File f = monfichier.getParentFile();
		System.out.println(f.toString());
		
		
		// create directory *********************************************
		System.out.println("Enter path");
		Scanner sc= new Scanner(System.in);
		String path = sc.next();
		System.out.println("Enter enter the name of directory ");
        path = path +"/"+sc.next();
        File ff = new File(path); 
    boolean b = ff.mkdir();
   if (b) System.out.println("directory cretaed");
    else System.out.println("sorry not created directory :/");
	}

}

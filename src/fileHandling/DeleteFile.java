package fileHandling;

import java.io.File;
import java.nio.file.DirectoryNotEmptyException;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.*;
public class DeleteFile {

	public static void main(String[] args) {
		System.out.println("Enter File Name to delete:");
		Scanner Sc = new Scanner(System.in);
		String fileName =Sc.nextLine();
		File file = new File("/home/nikkilkumar26gm/eclipse-workspace/fileManagement/store/"+fileName);
        
		if(file.delete())
		    {
		        System.out.println("File deleted successfully");
		    }
		    else
		    {
		        System.out.println("File Name incorrect");
		    } 
       
        
        Sc.close();

	}

}

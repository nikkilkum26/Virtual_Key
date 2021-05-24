package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreation {

	public static void main(String[] args) {
		System.out.println("Enter the name of file :");
	
		Scanner sc = new Scanner(System.in);
		String x= sc.next();
		File myFile =new File("/home/nikkilkumar26gm/eclipse-workspace/fileManagement/store/" + x);
		try {
			if(myFile.createNewFile()) {
				System.out.println("File created successfully!");
			}
			else {
				System.out.println("File already Exist!!! . Try again with new name...");
			}
		} catch (IOException e) {
			
			System.out.println("File error..");
		}
		sc.close();
	}

}

package fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the FileName");
		String fileName = sc.nextLine();
		System.out.println("========================================================");
		System.out.println("Type the content to be added!");
		String contentToFile =sc.nextLine();
		
		try {
			FileWriter output = new FileWriter("/home/nikkilkumar26gm/eclipse-workspace/fileManagement/store/" + fileName);
			output.write(contentToFile);
			System.out.println("Written successfully!!!!");
			output.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("try again later...");
		}
		
		sc.close();
	}

}

package fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class SearchFiles {

	public static void main(String[] args) {
		
		System.out.println("Enter the name of the File:");

		Scanner sc = new Scanner(System.in);
		String fileName= sc.nextLine();
		try (Stream<Path> stream = Files.find(Paths.get("/home/nikkilkumar26gm/eclipse-workspace/fileManagement/store/"), 5,
	            (path, attr) -> path.getFileName().toString().equals(fileName) )) {
	        
	        if(stream.findAny().isPresent()) {
	        	System.out.println("File Found!!!!!!!!!!");
	        }
	        else {
	        	System.out.println("File Not Found!!!!!!!!");
	        }
	} catch (IOException e) {
	        e.printStackTrace();
	}
		sc.close();
	}

}

package fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ListAllFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Path> x = null;
		try {
			x = Files.list(Paths.get("/home/nikkilkumar26gm/eclipse-workspace/fileManagement/store/"))
			        .filter(p -> Files.exists(p))
			        .map(s -> s.getFileName())
			        .sorted()
			        .collect(Collectors.toList());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Path not found");
		}
		System.out.println("Listing all files in directory:");

	x.forEach(System.out::println);

	}

}

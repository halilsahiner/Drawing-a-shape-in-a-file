package tr.org.lyk2016.shapeTransferFile;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileHelper {

	public static String readFile(String pathAndFile) throws IOException{ 

		List<String> lines = Files.readAllLines(Paths.get(pathAndFile));

		

		return lines.get(0);	
	}
	public static void createFile(String pathAndFile) throws IOException {

		 try {
				Path FilePath = Paths.get(pathAndFile);
				Files.createFile(FilePath);
				System.out.println(pathAndFile + " oluşturuldu.");
		} catch (FileAlreadyExistsException e) {
			System.out.println("Dosya zaten var.");
			}
	        

		}
	public static void writeToFile(String hede, String pathAndFile) throws IOException {

		Files.write(Paths.get(pathAndFile), hede.getBytes());
		 System.out.println(hede + pathAndFile + " dizinine yazdırıldı.");

	}
	
}
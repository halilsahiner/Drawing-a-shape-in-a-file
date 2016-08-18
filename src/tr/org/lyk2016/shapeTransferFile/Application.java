package tr.org.lyk2016.shapeTransferFile;

import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {

		String[] read = FileHelper.readFile("/home/halil/Masaüstü/shape").split(",");
		int width = Integer.parseInt(read[0]);
		int height = Integer.parseInt(read[1]);
		char character = read[2].charAt(0);

		Shape input = new Shape(width, height, character);
		System.out.println(input.getShape());

		FileHelper.createFile("/home/halil/Masaüstü/output");
		FileHelper.writeToFile(input.getShape(), "/home/halil/Masaüstü/output");

	}

}

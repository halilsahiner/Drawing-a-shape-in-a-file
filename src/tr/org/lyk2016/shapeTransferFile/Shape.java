package tr.org.lyk2016.shapeTransferFile;

public class Shape {

	private int width;
	private int height;
	private char character;

	public Shape(int width, int height, char character) {

		this.width = width;
		this.height = height;
		this.character = character;
	}

	public String getShape() {

		String result = "";
		for (int row = 0; row < this.height; row++) {
			for (int column = 0; column < this.width; column++) {
				result += this.character;

			}
			result += "\n";
			// result+=System.lineSeparator();

		}

		return result;

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}

}

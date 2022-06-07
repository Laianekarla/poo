package entities;

public class Rectangle {

	// atributos
	public double width;
	public double height;

	// metodos
	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * (width + height);
	}

	public double diagonal() {
		return Math.sqrt(height * height + width * width);
	}
}

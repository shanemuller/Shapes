package pkgshape;

public final class Rectangle extends Shape{
	private int Length;
	private int Width;
	
	public Rectangle(int length, int width) {
		super();
		Length = length;
		Width = width;
	}
	
	public int getLength() {
		return Length;
	}
	
	public void setLength(int length) {
		Length = length;
	}
	
	public int getWidth() {
		return Width;
	}
	
	public void setWidth(int width) {
		Width = width;
	}
	
	public double Area() {
		return (double) Length * Width;
	}
	
	public double Perimeter() {
		return (double) (2 * Length) + (2 * Width);
	}
	
	public boolean isSquare() {
		return (this.Width == this.Length);
	}
	
	public boolean AreSidesEqual() {
		return isSquare();
	}
}

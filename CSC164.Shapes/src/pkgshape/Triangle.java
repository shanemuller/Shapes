package pkgshape;

public class Triangle extends Shape{

	private double s1;
	private double s2;
	private double s3;

	public Triangle(double side1, double side2, double side3) throws Exception {
		this.s1 = side1;
		this.s2 = side2;
		this.s3 = side3;
		
		if (SquareArea() < 0) {
			throw new Exception("Illegal Triangle");
		}
	}

	public Triangle(double side) throws Exception {
		this.s1 = side;
		this.s2 = side;
		this.s3 = side;
		
		if (SquareArea() < 0) {
			throw new Exception("Illegal Triangle");
		}
	}

	public Triangle(double side2, double side3, float angle) {
		this.s2 = side2;
		this.s3 = side3;
		double s1 = (side2 * side2) + (side3 * side3) - (2 * side2 * side3 * Math.cos((double) angle));
		this.s1 = Math.sqrt(s1);
	}

	public double gets1() {
		return s1;
	}

	public void sets1(double s1) {
		this.s1 = s1;
	}

	public double gets2() {
		return s2;
	}

	public void sets2(double s2) {
		this.s2 = s2;
	}

	public double gets3() {
		return s3;
	}

	public void sets3(double s3) {
		this.s3 = s3;
	}

	public double AngleA() {
		// AngleA = Angle between side 1 and side 2
		double ang = ((this.s2 * this.s2) + (this.s3 * this.s3) - (this.s1 * this.s1)) / (2 * this.s2 * this.s3);
		return (Math.acos(ang) * (180 / Math.PI));
	}

	public double AngleB() {
		// AngleB = Angle between side 2 and side 3
		double ang = ((this.s3 * this.s3) + (this.s1 * this.s1) - (this.s2 * this.s2)) / (2 * this.s3 * this.s1);
		return (Math.acos(ang) * (180 / Math.PI));
	}

	public double AngleC() {
		// AngleC = angle between side 3 and side 1
		double ang = ((this.s1 * this.s1) + (this.s2 * this.s2) - (this.s3 * this.s3)) / (2 * this.s1 * this.s2);
		return (Math.acos(ang) * (180 / Math.PI));
	}

	public double Perimeter() {
		return s1 + s2 + s3;
	}
	
	private double HalfPerimeter() {
		return Perimeter() / 2;
	}
	
	private double SquareArea() {
		return this.HalfPerimeter() * 
				(this.HalfPerimeter() - this.s1) * 
				(this.HalfPerimeter() - this.s2) * 
				(this.HalfPerimeter() - this.s3);  
	}
	public double Area() {
		return Math.sqrt(this.SquareArea());
	}
	
	public boolean AreSidesEqual() {
		boolean isEqual = false;
		
		if ((this.s1 == this.s2)&&(this.s2 == this.s3)&&(this.s3==this.s1)){
			isEqual = true;
		}
		return isEqual;
	}
}

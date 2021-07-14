/**
 * 
 */
package shape;

/**
 * @author vinaypatel
 *
 * Class for Right Angle Triangle
 */
class RtTriangle extends Shape {

	double width;
	double height;

	//constructor
	public RtTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;

		
	}

	//get area for right angle trinagle
	@Override
	public double getArea() {
		return 0.5 * (width * height);
	}

	//get perimeter for right angle triangle
	@Override
	public double getPerimeter() {
		double hypo = Math.sqrt((width * width) + (height * height)); //hypotenuse of triangle
		return width + height + hypo;
	}

	//resize triangle dimension with the factor of x
	@Override
	public void resize(double x) {
		width = width * x;
		height = height * x;
	}

}
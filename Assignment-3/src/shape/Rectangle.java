/**
 * 
 */
package shape;

/**
 * @author vinaypatel
 *
 * Class Rectangle
 */
class Rectangle extends Shape {

	double width;
	double height;

	//constructor
	public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}

	//get area for rectangle
	@Override
	public double getArea() {
		return width * height;
	}

	//get Perimeter for rectangle
	@Override
	public double getPerimeter() {
		return 2.0 * (width + height);
	}

	//resize dimension with factor of x
	public void resize(double x) {
		width = width * x;
		height = height * x;
	}
}

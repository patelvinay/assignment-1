/**
 * 
 */
package shape;

/**
 * @author vinaypatel
 *
 * Class Circle
 */
public class Circle extends Shape {

	double radius;
	static double inf = Double.POSITIVE_INFINITY;

	public Circle(double radius) {
		super(inf);
		this.radius = radius;
	}
	
	//calculate the area of circle
	@Override
	public double getArea() {

		return Math.PI * Math.pow(radius, 2);
	}
	
	// calculate the circumference of circle
	@Override
	public double getPerimeter() {

		return 2 * Math.PI * radius;
	}
	
	//resize radius by factor x
	@Override
	public void resize(double x) {
		radius = radius * x;

	}
}
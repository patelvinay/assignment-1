package shape;
/**
 * 
 */

/**
 * @author vinaypatel
 *
 */
public abstract class Shape implements Resizable {

	// datamember numside
	double numSides;

	// constructor initialize numsides
	public Shape(double numSides) {
		this.numSides = numSides;
	}

	// get method for numside
	public double getNumSides() {
		return numSides;
	}

	// abstract method to get area
	public abstract double getArea();

	// abstract method to get perimeter
	public abstract double getPerimeter();
}

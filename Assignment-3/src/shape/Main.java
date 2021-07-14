/**
 * 
 */
package shape;

/**
 * @author vinaypatel
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// defining rectangle
		Shape rect = new Rectangle(2, 3);
		System.out.println("The Area of a Rectangle = " + rect.getArea() + "\n" + "The Perimeter of a Rectangle = "
				+ rect.getPerimeter());
		rect.resize(2);// resize
		System.out.println("The Area of a Rectangle after resizing dimension = " + rect.getArea() + "\n"
				+ "The Perimeter of a Rectangle after resizing dimension = " + rect.getPerimeter() + "\n");

		// defining Right angle triangle
		Shape rtTriangle = new RtTriangle(2, 3);
		System.out.println("The Area of a Right Triangle = " + rtTriangle.getArea() + "\n"
				+ "The Perimeter of a Right Triangle = " + rtTriangle.getPerimeter());
		rtTriangle.resize(2);// resize
		System.out.println("The Area of a Right Triangle after resizing dimension = " + rtTriangle.getArea() + "\n"
				+ "The Perimeter of a Right Triangle after resizing dimension = " + rtTriangle.getPerimeter() + "\n");

		// defining Circle
		Shape circle = new Circle(2);
		System.out.println("The Area of a Circle = " + circle.getArea() + "\n"
				+ "The Circumference of a Circle = " + circle.getPerimeter());
		circle.resize(2);// resize
		System.out.println("The Area of a Circle after resizing dimension = " + circle.getArea() + "\n"
				+ "The Circumference of a Circle after resizing dimension = " + circle.getPerimeter());

	}

}

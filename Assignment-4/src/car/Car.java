/**
 * 
 */
package car;

/**
 * @author vinaypatel
 *
 */
public class Car {

	protected int doors;
	protected String name;
	protected int wheels = 4; // as all cars have 4 wheels
	protected String engine;
	


	public Car() {}
	
	public Car(String name, int doors, String engine) {
		this.name = name;
		this.doors = doors;
		this.engine = engine;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public int getDoors() {
		return doors;
		
	}
	
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	public String getEngine() {
		return engine;
	}
	
	public void setEngine(String engine) 
	{
		this.engine = engine;
	}
	
	
	public void startEngine() {
		System.out.println("Engine Started");
	}
	
	public void accelerate() {
		System.out.println("Accelerating");
	}
	
	/**
	 * Polymorphism is a powerful mechanism in OOP to separate the interface and
	 * implementation so as to allow the programmer to program at the interface in
	 * the design of a complex system. we have many
	 * types of different cars that have variant types of specifications for engines, name, number of doors.
	 * We shall design a superclass called Car and define the method getEngine(), getDoors(), getName in the superclass.
	 * The subclasses shall then provides their actual implementation. In the main program, we
	 * declare instances of superclass, substituted with actual subclass; and invoke
	 * method defined in the superclass.
	 */
}

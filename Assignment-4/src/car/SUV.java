/**
 * 
 */
package car;

/**
 * @author vinaypatel
 */
public class SUV extends Car {

	protected String engine = "V6";
	protected int doors = 4;

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {

		super.setName(name);
	}

	@Override
	public int getDoors() {

		return doors;
	}

	@Override
	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public String getEngine() {

		return engine;
	}

	@Override
	public void setEngine(String engine) {

		this.engine = engine;
	}

	/*
	 * A subclass inherits all the variables and methods from its superclasses,
	 * including its immediate parent as well as all the ancestors. It is important
	 * to note that a subclass is not a "subset" of a superclass. In contrast,
	 * subclass is a "superset" of a superclass. It is because a subclass inherits
	 * all the variables and methods of the superclass; in addition, it extends the
	 * superclass by providing more variables and methods.
	 */
}

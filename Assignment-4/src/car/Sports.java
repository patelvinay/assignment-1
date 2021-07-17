/**
 * 
 */
package car;

/**
 * @author vinaypatel
 *
 */
public class Sports extends Car{

	protected String engine = "V6 Turbo";
	protected int doors = 2;

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

}

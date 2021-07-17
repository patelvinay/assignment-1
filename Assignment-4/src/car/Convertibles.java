/**
 * 
 */
package car;

/**
 * @author vinaypatel
 *
 */
public class Convertibles extends Car{

	protected String engine;
	protected int doors;

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

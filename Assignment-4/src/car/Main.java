/**
 * 
 */
package car;

/**
 * @author vinaypatel
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car jeep = new SUV(); //new suv jeep
		jeep.setName("Jeep Cherokee"); 

		
		System.out.println("SUV car\n"+ 
		"Model: " +jeep.getName() +"\n" +
		"Engine Type: " +jeep.getEngine() +"\n"+
		"Number of Doors: " +jeep.getDoors() +"\n"+
		"Number of Wheel: "+ jeep.getWheels());
		
		
		
		Car hyundai = new SUV(); //new suv jeep
		hyundai.setName("Hyundai Tucson"); 
		hyundai.setEngine("V7");// as we have different engine so change the value
		
		System.out.println("\nSUV Car\n"+ 
		"Model: " +hyundai.getName() +"\n" +
		"Engine Type: " +hyundai.getEngine() +"\n"+
		"Number of Doors: " +hyundai.getDoors() +"\n"+
		"Number of Wheel: "+ hyundai.getWheels());
		
		Car ferari = new Sports(); //new sports car
		ferari.setName("Ferari Roma"); 

		
		System.out.println("\nSports Car\n"+ 
		"Model: " +ferari.getName() +"\n" +
		"Engine Type: " +ferari.getEngine() +"\n"+
		"Number of Doors: " +ferari.getDoors() +"\n"+
		"Number of Wheel: "+ ferari.getWheels());
		
		Car ford = new Convertibles(); //new convertibles car
		ford.setName("Ford Mustang"); 
		ford.setDoors(2);
		ford.setEngine("3.5L V6");
		System.out.println("\nConvertible Car\n"+ 
		"Model: " +ford.getName() +"\n" +
		"Engine Type: " +ford.getEngine() +"\n"+
		"Number of Doors: " +ford.getDoors() +"\n"+
		"Number of Wheel: "+ ford.getWheels());
	
		
	}

}

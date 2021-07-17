/**
 * 
 */
package question2;

import java.util.*;

/**
 * @author vinaypatel
 *
 */
public class Question2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Map to store the elements
		Map<Integer, String> treemap = new TreeMap<Integer, String>(Collections.reverseOrder());

		// Put elements to the map
		treemap.put(1, "Jack");
		treemap.put(2, "Rick");
		treemap.put(3, "Kate");
		treemap.put(4, "Tom");
		treemap.put(5, "Steve");

		Set<?> set = treemap.entrySet();
		Iterator<?> i = set.iterator();

		// Traverse map and print elements
		while (i.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry e = (Map.Entry) i.next();
			System.out.print("Key" + e.getKey() + ": ");
			System.out.println(e.getValue());
		}
	}

}

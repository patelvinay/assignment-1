/**
 * 
 */
package question1;

import java.util.*;

/**
 * @author vinaypatel
 *
 */
public class ListSorting {

	public static void main(String[] argv)
	        throws Exception
	    {
	  
	        try {
	  
	            // Creating object of ArrayList<String>
	            ArrayList<String>
	                arraylist = new ArrayList<String>();
	  
	            // Populating arraylist
	            arraylist.add("Steve");
	            arraylist.add("Justin");
	            arraylist.add("Ajeet");
	            arraylist.add("John");
	            arraylist.add("Arnold");
	            arraylist.add("Chaitanya");
	  
	            // print arraylist
	            System.out.println("Original ArrayList Content: "
	                               + arraylist);
	  
	            // getting the subList
	            // using subList() method
	            List<String> sublist = arraylist.subList(1, 4);
	  
	            // print the subList
	            System.out.println("SubList stored in ArrayList: "
	                               + sublist);
	        }
	  
	        catch (IndexOutOfBoundsException e) {
	            System.out.println("Exception thrown : " + e);
	        }
	  
	        catch (IllegalArgumentException e) {
	            System.out.println("Exception thrown : " + e);
	        }
	    }
}

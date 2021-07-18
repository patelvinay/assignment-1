package question8;

import java.io.*;

/**
 * @author vinaypatel
 *
 */
class Example {
	public static void main(String args[]) {
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream("C:/myfile.txt");
		} catch (FileNotFoundException fnfe) {
			System.out.println("The file is not present at the given path");
		}
		int k;
		try {
			while ((k = fileInput.read()) != -1) {
				System.out.print((char) k);
			}
			fileInput.close();
		} catch (IOException ioe) {
			System.out.println("I/O error occurred: " + ioe);
		}
	}
}

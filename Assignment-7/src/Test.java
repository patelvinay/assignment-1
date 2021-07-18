import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) throws FileNotFoundException{
		try {
			throw new FileNotFoundException();
			
		} finally {}
	}

}

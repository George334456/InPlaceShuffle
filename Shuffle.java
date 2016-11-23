import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;


public class Shuffle {
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int size = s.nextInt();
		int array[] = new int [size];
		
		//Initialize the array from 1 to size.
		for (int i = 0; i < size; i ++){
			array[i] = i + 1;
			//System.out.println(array[i]);
		}
		// Essentially we swap from the current position to randomly selected position somewhere down the array excluding the current position.
		// This will guarantee that we will swap randomly.
		// (Equivalent of grabbing a number from the entire array at random, one at a time, and building it in place.)
		
		//Loop to size - 1 because we don't want to go out of range.
		for (int i = 0; i< size - 1; i ++){
			//Select random int from 0 to size - i - 1 (exclusive). Then add i + 1 to that int, so we get
			//a random int from i + 1 to size (exclusive).
			// This will give us the swap position.
			
			int swap= r.nextInt(size - i - 1) + i;
			int buffer = array[i];
			array[i] = array[swap];
			array[swap] = buffer;
		}
		
		//Print out everything.
		for (int i =0 ; i< size; i ++){
			System.out.println(array[i]);
		}
		s.close();
	}
}

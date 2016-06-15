package fileio;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderFileInput {

	private static String s;
	
	/*
	 * Uses a try with resources to close the reader after the try has completed
	 * Reads in from a file to the console
	 */
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
			while((s = br.readLine()) != null){
				System.out.println(s);
			}
		} catch (Exception e) {
			System.out.println("Error in file read.");
		}
	}
}

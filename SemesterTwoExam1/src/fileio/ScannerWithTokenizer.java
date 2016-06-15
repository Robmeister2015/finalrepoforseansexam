package fileio;

import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ScannerWithTokenizer {

	public static void main(String[] args){
		String filename = "test.txt";
		
		Set<String> words = new TreeSet<>();
		
		try(Scanner tokenizer = new Scanner(new FileReader(filename))){
			
			tokenizer.useDelimiter("\\W");
			
			while(tokenizer.hasNext()){
				String word = tokenizer.next();
				
				if(!word.isEmpty()){
					words.add(word.toLowerCase());
				}
			}
			
			for(String word : words){
				System.out.println(word);
			}
			
		}catch(Exception e){
			System.out.println("Error in the force!");
		}
	}
}

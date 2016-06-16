package stringprocessing;

public class StringFormatting {

	public static void main(String[] args){
		printHeader();
		printRow("Demando", 100, 122, false);
	}
	
	/*
	 * "-" means left aligned
	 * 
	 */
	
	static void printHeader(){
		System.out.printf("%-10s \t %s \t %s \t\t %s \t %s\n", "Player", "Matches", "Goals", "Goals Per Match", "Top Player");
	}
	
	static void printRow(String player, int matches, int goals, boolean topPlayer){
		System.out.printf("%-10s \t %5d \t\t %d \t\t\t %.1f \t\t %b\n", player, matches, goals, ((float)goals/(float)matches), topPlayer);	
	}
}

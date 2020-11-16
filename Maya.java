public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors = {"Red", "Yellow", "Green", "Blue"};

		// There are four colors for regular, non-wild cards
		for (int j = 0; j < 4; j++) { // Loop through each color
			// Uno cards are numbered 0 to 9 
			for (int i = 0; i <= 9; i++) {	// Give ranks from 0 to 9 for each card colors
				System.out.println("Card with color " + colors[j] + " and rank " + i);				
			}
		}
    	}

}

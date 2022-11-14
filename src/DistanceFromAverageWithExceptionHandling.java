import javax.swing.JOptionPane;

public class DistanceFromAverageWithExceptionHandling {
	public static void main(String[] args) {
		// declaring variables
		String userInputForArray;
		int x;
		boolean QUIT = false;
		
		
		// declaring an array 
		double[] userInput = new double[x];
		
		// creating try and accept statement for userinput 
		try {
			// asking user how big the array should be 
			userInputForArray = JOptionPane.showInputDialog(null, "please enter how big you would like the array to be");
			
			// turning user input into an array 
			x = Integer.parseInt(userInputForArray);

			// creating loop if user wants to try again
			while(userInputForArray = true) {
				
				
			}
		}
		catch(NumberFormatException) 
		{
			JOptionPane.showMessageDialog(null, "please enter an integer");
		}
	
				
		
		
		
	}

}

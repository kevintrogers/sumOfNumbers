

import javax.swing.JOptionPane;


/**
 * @author Kevin Rogers
 * CS130
 * Homework9
 *
 */
public class sumofnumbers {

	public static void main(String[] args) {
		String input;
		int num = 0;
		
		
		JOptionPane.showMessageDialog(null, "This program is designed to calculate the sum of consecutive\n numbers starting at 1 " +
									" and ending at a certain point.");
		input = JOptionPane.showInputDialog("Please choose a number as the ending point?");
		

			if (isANum(input)){
				num = Integer.parseInt(input);
				sum(num);
				JOptionPane.showMessageDialog(null, "The sum of these numbers is " + sum(num) + ".");
			}
			else 
				JOptionPane.showMessageDialog(null, "That is not a digit. Please try again.");
				
			System.exit(0);
	}//main
	
	private static boolean isANum (String input) {
		boolean numSoFar = true;
	 	 
		for (int i = 0; i < input.length(); i++){
			if (!Character.isDigit(input.charAt(i)))
				numSoFar = false;
		}//for
		return numSoFar;
	}//isANum
	
	private static int sum (int n) {
		if (n==1)
			return 1;
		else
			return n + sum(n-1);
	}//sum

}

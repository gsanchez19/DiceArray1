// author @ Gabe Sanchez
// AP Comp Sci Period 7
// Dice Array
// Create two dice objects, roll 1000 times, track # of times each outcome was rolled.

public class MainTest 
{

	public static void main(String[] args) 
	{
		Dice die1 = new Dice();
		Dice die2  = new Dice();

		int[] theCounter = new int[13];
		
		
		int doubleDice;
		
		theCounter[0] = 0;
		theCounter[1] = 0;
		theCounter[2] = 0;
		theCounter[3] = 0;
		theCounter[4] = 0;
		theCounter[5] = 0;
		theCounter[6] = 0;
		theCounter[7] = 0;
		theCounter[8] = 0;
		theCounter[9] = 0;
		theCounter[10] = 0;
		theCounter[11] = 0;
		theCounter[12] = 0;
		
		
		for(int i = 0; i < 1000; i ++)
		{
			doubleDice = die1.roll() + die2.roll();
			theCounter[(doubleDice)] = theCounter[doubleDice] + 1;
			
			
		}
			
		int programCheck = theCounter[2] + theCounter[3] + theCounter[4] + theCounter[5] + theCounter[6];
		programCheck = programCheck + theCounter [7] + theCounter[8] + theCounter[9] + theCounter[10] + theCounter[11] + theCounter[12];
		
			System.out.println("2 was rolled " + theCounter[2] + " times.");		
			System.out.println("3 was rolled " + theCounter[3] + " times.");	
			System.out.println("4 was rolled " + theCounter[4] + " times.");	
			System.out.println("5 was rolled " + theCounter[5] + " times.");	
			System.out.println("6 was rolled " + theCounter[6] + " times.");	
			System.out.println("7 was rolled " + theCounter[7] + " times.");	
			System.out.println("8 was rolled " + theCounter[8] + " times.");	
			System.out.println("9 was rolled " + theCounter[9] + " times.");	
			System.out.println("10 was rolled " + theCounter[10] + " times.");	
			System.out.println("11 was rolled " + theCounter[11] + " times.");	
			System.out.println("12 was rolled " + theCounter[12] + " times.");
			
			System.out.println("Program check. Times rolled: " + programCheck);
			
	
	
	
	
	
	
	
	}

}


public class MainTest 
{

	public static void main(String[] args) 
	{
		Dice die1 = new Dice();
		Dice die2  = new Dice();
		
		int[] theDicer = new int[1000];
		
		int[] theCounter = new int[11];
		
		// boolean to indicate weather array has been filled or not.
		
		for(int i = 0; i < theDicer.length; i ++)
		{
			int doubleDice = die1.roll() + die2.roll();
			theDicer[i] = doubleDice;
			theCounter[doubleDice] = theCounter[doubleDice]
			
			
		}
			System.out.println("3 was rolled " + theCounter[2] + " times.");		
			
		
		//while(notFilled)
		//{
			//theDicer[count] = 
			//count 
	
	
	
	
	
	
	
	}

}

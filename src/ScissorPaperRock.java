
	import java.util.Random;
	import java.util.Scanner;
	
	public class ScissorPaperRock {

		private static int userchoice3;

		public static void main(String[] args) 
		{
			
			Random random = new Random();
			
			Scanner scanner = new Scanner(System.in);
			
			int userChoice, userchoice1, userchoice2, userchoice4,userchoice5, computerChoice;
			
			userChoice = 0; 
			userchoice1 = 1;
			userchoice2 = 2;
			userchoice3 = 3;
			userchoice4 = 4;
			userchoice5 = 5;
			
			System.out.println("Enter move (0 = odd; 1 = even;)");
			userChoice = scanner.nextInt();
			
			
			
			if(userChoice < 0 || userChoice > 2)
			{
				System.out.println("Invalid choice. Ending program.");
				
				
				System.exit(0);
			}
			
		
			computerChoice = random.nextInt(6);
			
			if(userChoice == computerChoice)
			{
				System.out.print("");
				
				
			}
			
			if(userChoice == 0 && userChoice == 1 || userChoice == 3 || userChoice == 5)		
			{
				if(computerChoice == 1)
				{
					System.out.println("You Guess Correctly, its Odd");
					
				}
				else
				{
					System.out.println("");
					
				}
			}
			else if(userChoice == 1 && userChoice == 2 || userChoice == 4)	// User chooses paper
			{
				if(computerChoice == 0)
				{
					System.out.println("");
					
				}
				else
				{
					System.out.println("");
					
				}
			}
			else
			{
				if(computerChoice == 0)
				{
					System.out.println("");
					
				}
				else
				{
					System.out.println("");
								}
			}
			
			scanner.close();
		}
	}


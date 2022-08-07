

import java.util.Scanner;
class Guesser{
	//Guesser will guess the number
	public int Guesser(){
		Scanner sc = new Scanner(System.in);
		int Guessnumber;
		System.out.print("Guesser Kindly Enter the number from range (0 to 50) :");
		Guessnumber=sc.nextInt();
		return Guessnumber;
	}
}
class Player{
	//Players will enter their answers
	public int guessNumber(){
	Scanner sc = new Scanner(System.in);
	int playerGuessno;
	System.out.print("Player kindly guess the number from range (0 to 50)  :");
	playerGuessno = sc.nextInt();
	return playerGuessno;
	}	
}
class Umphire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	//Umpire will collect the number from Guesser
	public void collectnumberFromGuesser(){
		Guesser gs = new Guesser();
		numFromGuesser=gs.Guesser();
	}
	//Umpire will collect the number from players
	public void collectnumberFromPlayers(){
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		System.out.println("**Players Turn**");
		numFromPlayer1=p1.guessNumber();
		numFromPlayer2=p2.guessNumber();
		numFromPlayer3=p3.guessNumber();
	}
	//Match Between 1 & 2 Players
	public void matchBetween12() {
		Guesser gs=new Guesser();
		Player p1 = new Player();
		Player p2=new Player();
		int numFromGuess=gs.Guesser();
		int numPlayer1=p1.guessNumber();
		int numPlayer2=p2.guessNumber();
		if(numFromGuess<=50&&numFromGuess>0) {
			if(numFromGuess==numPlayer1&&numFromGuess!=numPlayer2) 
			{
				System.out.println("Player 1 won the game");
				System.out.println();
				System.out.println("~~~~~Player 2 & 3 - Better luck next time!!~~~~~");
			}
			else if (numFromGuess!=numPlayer1&&numFromGuess==numPlayer2) 
			{
				System.out.println("Player 2 won the game");
				System.out.println();
				System.out.println("~~~~~Player 1 & 3 - Better luck next time!!~~~~~~");
			}
			else if(numFromGuess==numPlayer1&&numFromGuess==numPlayer2) 
			{
				System.out.println("Again Both Answered correctly So Finally - 1 & 2 Won The Match");
				System.out.println();
				System.out.println("~~~~~Player 3 - Better luck next time !!~~~~~~");
			}
			else 
			{
				System.out.println("No one guessed correctly - Match Draw");
			}
			
		}else {
			System.out.println("Invalid !! -- Guesser Please guess the Number in the range (0 to 50)");
			matchBetween12();
			
		}
		if(numPlayer1>50&&numPlayer1>0) 
		{
			System.out.println();
			System.out.println("<--**********************************************-->");
			System.out.println("* Player 1 please guess the number from range 0-50 *");
			
		}
		if(numPlayer2>50&&numPlayer2>0) 
		{
			System.out.println();
			System.out.println("<--**********************************************-->");
			System.out.println("* Player 2 please guess the number from range 0-50 *");
		}
	}
	//Match Between 2 & 3 Players
	public void matchBetween23() 
	{
		Guesser  gs = new Guesser();
		Player p2=new Player();
		Player p3=new Player();
		int numFromGuess=gs.Guesser();
		int numPlayer2=p2.guessNumber();
		int numPlayer3=p3.guessNumber();
		if(numFromGuess<=50&&numFromGuess>0) 
		{
			if(numPlayer2==numFromGuess&&numPlayer3!=numFromGuess) 
			{
				System.out.println("Player 2 won the match");
				System.out.println();
				System.out.println("~~~~~Players 1 & 3 - Better luck Next Time !! ~~~~~~");
			}
			else if(numPlayer2!=numFromGuess&&numPlayer3==numFromGuess) 
			{
				System.out.println("Player 3 won the match");
				System.out.println();
				System.out.println("~~~~~Players 1 & 2 - Better Luck Next Time !! ~~~~~~");
			}
			else if(numPlayer2==numFromGuess&&numPlayer3==numFromGuess)
			{
				System.out.println("Again Both Answered correctly So Finally - 2 & 3 Won The Match");
				System.out.println();
				System.out.println("~~~~~Player 1 - Better Luck Next Time !!~~~~~");
			}
			else if(numPlayer2!=numFromGuess&&numPlayer3!=numFromGuess)
			{
				System.out.println(" All Players lost");
			}
		}else 
		{
			System.out.println("Invalid !! Guesser guessed the number above that is not in range(0-50)");
			matchBetween23();
		}
		if(numPlayer2>50&&numPlayer2>0) 
		{
			System.out.println();
			System.out.println("<--**********************************************-->");
			System.out.println("* Player 2 please guess the number from range 0-50 *");
			
		}
		if(numPlayer3>50&&numPlayer3>0) 
		{
			System.out.println();
			System.out.println("<--**********************************************-->");
			System.out.println("* Player 3 please guess the number from range 0-50 *");
		}

		
		}
	//Match Between 1 & 3 Players
	public void matchBetween13() {
		Guesser  gs = new Guesser();
		Player p1=new Player();
		Player p3=new Player();
		int numFromGuess=gs.Guesser();
		int numPlayer1=p1.guessNumber();
		int numPlayer3=p3.guessNumber();
		if(numFromGuess<=50&&numFromGuess>0) 
		{
			if(numFromGuess==numPlayer1&&numFromGuess!=numPlayer3) 
			{
				System.out.println("Player 1 won the match");
				System.out.println();
				System.out.println("~~~~~Players 2 & 3 -  Better Luck Next Time !!~~~~~");
			}
			else if(numFromGuess!=numPlayer1&&numFromGuess==numPlayer3) 
			{
				System.out.println("Player 3 won the match");
				System.out.println();
				System.out.println("~~~~~Players 1 & 2 -  Better Luck Next Time !!~~~~~");
			}
			else if(numFromGuess==numPlayer1&&numFromGuess==numPlayer3) 
			{
				System.out.println("Again Both Answered correctly So Finally - 1 & 3 Won The Match");
				System.out.println();
				System.out.println("~~~~~Players  2  -  Better Luck Next Time !!~~~~~");
			}
			else if(numFromGuess!=numPlayer1&&numFromGuess!=numPlayer3) 
			{
				System.out.println("All Lost Again");
			}
			
			
		}
		else 
		{
			System.out.println("Invalid !! Guesser guessed the number above that is not in range(0-50)");
			matchBetween13();
		}
		if(numPlayer1>50&&numPlayer1>0) 
		{
			System.out.println();
			System.out.println("<--**********************************************-->");
			System.out.println("* Player 1 please guess the number from range 0-50 *");
			
		}
		if(numPlayer3>50&&numPlayer1>0) 
		{
			System.out.println();
			System.out.println("<--**********************************************-->");
			System.out.println("* Player 3 please guess the number from range 0-50 *");
		}

	}

	
		
	//Umpire will compare the numbers of players and the guesser's number
	public void compare(){
		System.out.println();
    //1st Condition
	if(numFromGuesser<=50&&numFromGuesser>0) 
	{
		if(numFromPlayer1==numFromGuesser) 
		{
			if(numFromPlayer1==numFromPlayer2&&numFromPlayer1==numFromPlayer3)
			{
				System.out.println("Match got  tied");
				System.out.println("************************Rematch**************************");
				collectnumberFromGuesser();
				collectnumberFromPlayers();
				compare();
			}
			else if(numFromPlayer1==numFromPlayer2) 
			{
				System.out.println("1 and 2 Guessed Correct So again  match between 1 & 2");
				System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''");
				matchBetween12();
			}
			else if(numFromPlayer1==numFromPlayer3) 
			{
				System.out.println(" 1 and 3 Guessed Correct So again  match between 1 & 3");
				System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''");
				matchBetween13();
			}else 
			{
			System.out.println("1st Player won the Game");
			}
		}
		else if(numFromPlayer2==numFromGuesser) 
		{
			if(numFromPlayer2==numFromPlayer3)
			{
				System.out.println("2 and 3 Guessed Correct So again  match between 2 & 3");
				System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''");
				matchBetween23();
			}
			else if(numFromPlayer2!=numFromGuesser) {
				System.out.println("2nd Player Better Luck Next Time");
			}
			else 
			{
			System.out.println("2nd Player won the game");
			}
		}
		else if(numFromPlayer3==numFromGuesser)
		{
			System.out.println("3rd Player won the game");
		}
		else
		{
			System.out.println("All Lost Please Try Again");
		}
		//2nd condition
		if(numFromGuesser!=numFromPlayer1&&numFromGuesser!=numFromPlayer2&&numFromGuesser!=numFromPlayer3)
		{
			System.out.println();
			System.out.println("~~~~~All Players - Better Luck Next Time !!~~~~~");
		}
		else if(numFromGuesser!=numFromPlayer1&&numFromGuesser!=numFromPlayer2) 
		{
			System.out.println();
			System.out.println("~~~~~1st and 2nd player - Better luck next time !!~~~~~");
		}
		else if(numFromGuesser!=numFromPlayer1&&numFromGuesser!=numFromPlayer3) 
		{
			System.out.println();
			System.out.println("~~~~~1st and 3rd player - Better luck next time !!~~~~~");
		}else if(numFromGuesser!=numFromPlayer2&&numFromGuesser!=numFromPlayer3) 
		{
			System.out.println();
			System.out.println("~~~~~2nd and 3rd Players - Better Luck Next Time !!~~~~~");
		}
		
	//3rd Condition
	if(numFromPlayer1>50&&numFromPlayer1>0) 
	{
		System.out.println();
		System.out.println("<--**********************************************-->");
		System.out.println("* Player 1 please guess the number from range 0-50 *");
		
	}
	if(numFromPlayer2>50&&numFromPlayer2>0) 
	{
		System.out.println();
		System.out.println("<--**********************************************-->");
		System.out.println("Player 2 please guess the number from range 0-50");
	}
	if(numFromPlayer3>50&&numFromPlayer3>0) 
	{
		System.out.println();
		System.out.println("<--**********************************************-->");
		System.out.println("Player 3 please guess the number from range 0-50");
	}
		
	}
	else 
	{
		System.out.println("Invalid !! Guesser guessed the number that is not in range(0-50)");
		System.out.println();
		System.out.println("******************************Rematch******************************");
		collectnumberFromGuesser();
		collectnumberFromPlayers();
		compare();
	}
  }
}
public class GuessingGame {

	public static void main(String[] args) {
		Umphire ump= new Umphire();
		ump.collectnumberFromGuesser();
		ump.collectnumberFromPlayers();
		ump.compare();
	}
}

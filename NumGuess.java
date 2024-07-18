import java.util.*;
public class NumGuess{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Random r=new Random();
		int guess,num,total_score=0;
		int max_atpt=10;
		int rounds=0,max_rounds=5,ch;
		System.out.println("************Welcome to the Number Guess Game************");
		do{
			int atpt=1;
			num=r.nextInt(100)+1;
			System.out.println("\n\n****************ROUND : "+(rounds+1)+"******************");
			System.out.println("You have exactly "+max_atpt+" attempts and you have to guess the correct answer which is between 1 to 100:");
			while(atpt<=max_atpt){
				System.out.println("Guess your number: ");
				guess = in.nextInt();
				atpt++;
				if(guess<num){
					System.out.println("\n\nYou have guessed a number that is lower than selected random number:\nTry again");
					System.out.println("\nREMAINING ATTEMPTS "+(max_atpt-atpt+1));
					System.out.println("-----------------------------------------------------------------------------------");
				}
				else if(guess>num){
					System.out.println("\n\nYou have guessed a number that is greater than selected random number:\nTry again");
					System.out.println("\nREMAINING ATTEMPTS "+(max_atpt-atpt+1));
					System.out.println("-------------------------------------------------------------------------------------");


				}
				else{
					System.out.println("\nCongratulations, you have guessed the number within "+(atpt-1)+" attempts");
					total_score+=(max_atpt-atpt+1)*10;
					break;
				}
			}
			if(atpt>max_atpt){
				System.out.println("\nYour attempts are over and you have not guessed the correct answer, sorry *Please Try Again*");
			}
			rounds++;
			System.out.println("\n\nThe selected Random number is: "+num);
			if(rounds>=2){
				System.out.println("\nYOUR TOTAL SCORE(including previously played rounds) BASED ON YOUR ATTEMPTS IS : "+total_score);
			}
			else{
				System.out.println("\nYOUR TOTAL SCORE BASED ON YOUR ATTEMPTS IS : "+total_score);
			}
			System.out.println("\nNUMBER OF ROUNDS PLAYED : "+rounds);
			if(rounds<max_rounds){
				System.out.println("\nAnother "+(max_rounds-rounds)+" Rounds Available for you");
				System.out.println("\nDo you want to continue?, Enter 0 to exit and 1 to continue:");
				ch=in.nextInt(); 
			}
			else{
				ch=0;
			}
			
		}while(ch==1&& rounds<max_rounds);
		System.out.println("\n\n********Thank you for playing! Your final score is " + total_score + " after " + rounds + " rounds.**********");
	}
}


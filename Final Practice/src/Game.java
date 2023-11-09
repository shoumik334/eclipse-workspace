import java.util.*;

public class Game {
	
	private int secretNumber;
	private int noOfguess;
	
	public Game(int minNum,int maxNum) {
		Random random=new Random();
		secretNumber=random.nextInt(maxNum-minNum+1)+minNum;
		noOfguess=0;
	}
	public int getnoOfguess() {
		return noOfguess;
	}
	
	public void setnoOfguess(){
		this.noOfguess= noOfguess;
		
	}
	public int userInput() {
		Scanner inp =new Scanner(System.in);
		System.out.println("Guess the number:");
		
		try {
			int userGuess=inp.nextInt();
			noOfguess++;
			return userGuess;
		}catch(Exception e){
			System.out.println("Please enter a valid number");
			return -1;
			
		}
	}
	
	public boolean isCorrectNumber(int userGuess) {
		if(userGuess==secretNumber) {
			return true;
		}
		else if( userGuess>secretNumber) {
			System.out.println("Try a lower number");
			
		}
		else {
			System.out.println("Try a higher number");
		}
		return false;
	}
	
	public void playGame() {
		while(true) {
			int userGuess=userInput();
			if(isCorrectNumber(userGuess)) {
				System.out.println("Congratulations! You guess correct number");
				System.out.println();
				System.out.println("You need total "+noOfguess+" Guess ");
				break;
				
			} 
		}
	}
	public static void main(String[] args) {
		Game game=new Game(1,100);
		game.playGame();
		

	}

}

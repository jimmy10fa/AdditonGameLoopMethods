import java.util.Scanner;

public class LoopsAndMethodsAdditonGame {
	public static void main(String[] args) {
		System.out.println("Hello class.");
		
		//Call the addition game method.
		AdditonGameMethod();
	}
	public static void AdditonGameMethod() {
		System.out.println("Inside the addition game method.");
		
		int hardness = 5;
		
		// Set up my for loop to go through the number of rounds
		int numberOfRounds = 2;
		for(int roundNumber = 1; 
		roundNumber <= numberOfRounds;  
		roundNumber = roundNumber + 1){
			System.out.println("Inside the for loop. Round: " + roundNumber);
			boolean isAnswerCorrect = getAndCheckStudentAnswer(hardness);
		}
	}
	
	public static boolean getAndCheckStudentAnswer(int hardness) {
		System.out.println("Inside get and check student answer method.");
		int number1 = (int)(Math.random()*hardness);
		int number2 = (int)(Math.random()*hardness);
		System.out.println("Add " + number1 + " and " + number2 +".");
		//Scanner input = new Scanner(System.in);
		//int studentAnswer = input.nextInt();
		Scanner get = new Scanner(System.in);
		int studentAnswer = get.nextInt();
		if(studentAnswer == (number1 + number2)){
			System.out.println("Good work, your answer was correct.");
			return true;
		}else{
			System.out.println("Nice try, but the correct answer was " + (number1 + number2));
			return false;
		}
	}
}

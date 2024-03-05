import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        int minimumRange = 1;  
        int maximumRange = 100;  
        int maximumAttempts = 10;  
        
        playGame(scanner, minimumRange, maximumRange, maximumAttempts);
        
        scanner.close();  
    }

    public static void playGame(Scanner scanner, int minRange, int maxRange, int maxAttempts) {
        Random random = new Random();  
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;  
        
        System.out.println("Guess the number between " + minRange + " and " + maxRange);

        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            System.out.print("Attempt " + attempts + ": Enter your guess: ");
            int userGuess = scanner.nextInt(); 
            
            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You have guessed the right one in " + attempts + " attempts.");
                return;
            } else if (userGuess < targetNumber) {
                System.out.println("Your guess is lower than the target number.");
            } else {
                System.out.println("Your guess is higher than the target number.");
            }
        }
        
        System.out.println("Sorry, you've exhausted all attempts. The number was: " + targetNumber);
        System.out.println("Better luck next time");
    }
}

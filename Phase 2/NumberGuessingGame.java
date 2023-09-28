import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        int randomNumber = (int) (Math.random() * 100) + 1;
      
        System.out.println("Enter your guess:");
        int guess = s.nextInt();
       
        while (guess != randomNumber) {
       
            if (guess > randomNumber) {
                System.out.println("Your guess is too high. Guess lower:");
                guess = s.nextInt();
            } 
           
            else {
                System.out.println("Your guess is too low. Guess higher:");
                guess = s.nextInt();
            }
        }
        
        System.out.println("Congratulations! You guessed the correct number.");
    }
}
public class Main {

    public static void main(String[] args) {
        int guess = 26;
        int secretNumber = 25;

        if (guess == secretNumber) {
            System.out.println("Correct!");
        }
        if (guess < secretNumber) {
            System.out.println("Guess is too low!");
        }

        if (guess > secretNumber) {
                System.out.println("Guess is too high!");
            }
        }
    }

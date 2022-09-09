package unit3_fundamentals.challenges;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class exercises {
    public static void main(String[] args) {
//        Exercise 1
//
//        Write a program which prints numbers from 89 to 117.

        for (int i = 89; i <= 117; i++) {
            System.out.println(i);
        }

        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();


    }
    public static void exercise2() {
//        Exercise 2
//
//        Write a program which prints numbers from 1 to 40. After every third number, print “Quack.”.
        int count = 1;

        for (int i = 1; i <= 40; i++) {

            System.out.println(i);

            if (count == 3) {
                System.out.println("Quack.");
                count = 0;
            }

            count++;

        }
    }
        public static void exercise3() {
//            Exercise 3
//
//            Write a program which asks the user for a password. Make the password “shark50”.
//            Each time the user enters the password incorrectly, prompt them for a
//            password again. When the user enters the password correctly, print “ACCESS APPROVED”.
            Scanner scanner = new Scanner(System.in);
            String input;

            do {
                System.out.print("Enter Password: ");
                input = scanner.next();
            } while (!input.equals("shark50"));

            System.out.println("ACCESS APPROVED");
        }
        public static void exercise4() {
//            Write a program which makes use of a loop to print the following output:
//
//            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.

            for (int i = 0; i < 11; i++) {
                System.out.print(i + ",");
            }
            System.out.println("\b\b.");
        }
    public static void exercise5() {
//        Exercise 5
//
//        Create a game where the program picks a random number from 1 to 100 and
//        the player has to guess it. Each time the player makes a guess, print “HIGHER”
//        if the guess was too low or “LOWER” if the guess was too high. If the player
//        correctly guesses the number, print “CORRECT”, then end the game.
//
//        You can use the line of code below which produces a random number from 1 to 100,
//            and stores it in randomNumber.
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;

        System.out.println("\n--- Guess My Number Game ---");

        do {

            System.out.print("\nGuess: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("HIGHER.");
            } else if (guess > randomNumber) {
                System.out.println("LOWER.");
            } else {
                System.out.println("CORRECT. My number was " + randomNumber + ".");
            }

        } while (guess != randomNumber);
    }

    public static void exercise6() {
//        Exercise 6
//
//        Modify the program in Exercise 5 so that once the game is won,
//                it informs the player how many guesses it took them.
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;
        int guessTracker = 0;

        System.out.println("\n--- Guess My Number Game ---");

        do {

            System.out.print("\nGuess: ");
            guess = scanner.nextInt();
            guessTracker++;

            if (guess < randomNumber) {
                System.out.println("HIGHER." );

            } else if (guess > randomNumber) {
                System.out.println("LOWER.");
            } else {
                System.out.println("CORRECT. My number was " + randomNumber + "and it took you " + guessTracker + " guesses!");
            }

        } while (guess != randomNumber);
    }
}

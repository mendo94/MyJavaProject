package unit2_fundamentals.challenges;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

//Exercise 1
//
//        Write a program with two int variables, int x and int y, and give each one a value.
//        Depending on their values, print “x is bigger than y”, “x is smaller than y”, or “x and
//        y are the same”. Change the values and run the program a few times to check it works.

public class conditionalchallenges {
    public static void main(String[] args) {
        int x = 12;
        int y = 20;

        if (x > y) {
            System.out.println("x is bigger than y.");
        } else if (x == y) {
            System.out.println("x and y are the same");
        } else {
            System.out.println("x is smaller than y.");
        }
        exercise2();
        exercise3();
        exercise4();
    }

    public static void exercise2() {
//        Exercise 2
//
//        Modify the program from Exercise 1 so it also print
//        s the difference between x and y.
        int x = 12;
        int y = 20;

        if (x > y) {
            int difference = x - y;
            System.out.format("x is bigger than y by %d digits.", difference);
        } else if (x == y) {
            System.out.println("x and y are the same");
        } else {
            int difference = y - x;
            System.out.format("x is smaller than y by %d digits.", difference);
        }

    }

    public static void exercise3() {
//        Exercise 3
//
//        Create a game where the program picks a random number from 1 to 5 and you,
//        the player, has to guess it.
//
//                If the player guesses right, print “Correct! Aren’t you lucky.“.
//
//        If the player guesses wrong, print “Hard luck! Maybe next time.“.
//
//        You can use the line of code below which produces a random number from 1
//        to 5 and stores it in a variable called randomNumber.

        Scanner scanner = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.print("\n Please pick a number between 1 through 5: ");
        int userChoice = scanner.nextInt();

        if (userChoice == randomNumber) {
            System.out.println("Correct! Aren't you lucky..");
        } else {
            System.out.format("\n Hard luck! Maybe next time. The correct answer was %d", randomNumber);
        }

    }

    public static void exercise4() {
//        Exercise 4
//
//        Modify the program from Exercise 3 so it gives the player two chances
//        to guess the number.
        Scanner scanner = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.print("\n Please pick a number between 1 through 5: ");
        int userChoice = scanner.nextInt();

        if (userChoice != randomNumber) {
            System.out.print("\n Your guess is incorrect, I will give you one more chance to guess again. Guess correctly now: ");
            int secondUserChoice = scanner.nextInt();
            if (secondUserChoice != randomNumber) {
                System.out.format("\n I gave you a second chance and you failed, the correct answer was %d", randomNumber);

            } else {
                System.out.println("Now you got it!");
            }
        } else {
            System.out.format("\n Correct! Aren't you lucky..");
        }

    }
}

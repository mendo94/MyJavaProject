package unit2_fundamentals;
//import the package file path
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input);
        scanner();
    }

    public static void scanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName= scanner.next(); //used to read strings
        System.out.println(userName + " is a fantastic name!");

        System.out.println("\nHow old are you, " + userName + "?");
        int userAge = scanner.nextInt(); //used to read integers
        System.out.println("Your name is " + userName + " and you are " + userAge + " years old.");

        System.out.println("\n How tall are you?");
        double userHeight = scanner.nextDouble(); //used to read integers
        System.out.println("You are " + userHeight + " feet tall!");
    }
}


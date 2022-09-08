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
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String userName= scanner.next(); //used to read strings
        System.out.println(userName + " is a fantastic name!");

        System.out.println("How old are you?");
        int userAge = scanner.nextInt(); //used to read integers
        System.out.println("Your name is " + userName + " and you are " + userAge + " years old.");
    }
}


package unit2_fundamentals.challenges;
import java.util.Scanner;
//Exercise 1
//
//        Make changes to the program from the lesson video so that:
//
//        It prints “You’ve lived x years. In another x years you’ll be 2x years old.”, where x is their age.
//
//        It informs the user of how many characters are in their name.
//
//        Hint: Use the .length() method on the string, which returns the number of characters e.g. theString.length()

public class UserInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.println();
        int multiplyAge = age * 2;


        System.out.println("You've lived " + age + " years. In another " + age + " years, you'll be " + multiplyAge + " years old.");
        characters();
    }

    public static void characters() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.next();

        System.out.println();
        int charsInName = name.length();


        System.out.format("There are %d characters in your name, " + name + ".", charsInName);

    }
}

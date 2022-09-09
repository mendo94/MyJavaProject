package unit2_fundamentals;
import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        System.out.print(1);
        System.out.print(2);
        System.out.print(3);

        if (false) {
            System.out.print(4);
            System.out.print(5);
            System.out.print(6);

        }
        System.out.print(7);
        System.out.print(8);
        System.out.print(9);
    height();
    stringEquality();
    nestedIfStatements();
    }

    public static void height () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Cedar Point");
        System.out.print("Please enter your height in centimeters: ");
        int height = scanner.nextInt();

        if (height < 130) {
            System.out.println("You do not meet the height requirements, your height is too short.");

        } else if (height < 130 || height > 120) {
            System.out.println("All aboard.");

        } else if (height > 210) {

            System.out.println("Your height is taller than the requirements, you cannot ride.");

        } else if (height == 210) {
            System.out.println("Further approval is needed for you to ride this ride, please see an attendant");

        } else {
            System.out.println("You pass the height requirements.");

        }
    }

    public static void stringEquality () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("VIP Lounge");

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have a VIP pass: (yes/no): ");
        String vipPass = scanner.next();

        if (age >= 18 && vipPass.equals("yes") || age >= 70) {
            System.out.println("Thanks, go on in.");
        } else {
            System.out.println("Call the cops.");
        }
    }

    public static void nestedIfStatements () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("VIP Lounge");

        System.out.print("Age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.print("Do you have a VIP pass: (yes/no): ");
            String vipPass = scanner.next();

            if (vipPass.equals("yes")) {
                System.out.println("Thanks, go on in.");
            } else {
                System.out.println("Sorry you must have a pass to enter.");
            }
        } else {
            System.out.println("Sorry you must be over 18 years old.");
        }
    }
}

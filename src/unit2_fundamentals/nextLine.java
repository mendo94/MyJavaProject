package unit2_fundamentals;

import java.util.Scanner;

public class nextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        scanner.next();
//        scanner.nextInt();
//        scanner.nextDouble();
//        boolean b = scanner.nextBoolean();


        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
    }
}

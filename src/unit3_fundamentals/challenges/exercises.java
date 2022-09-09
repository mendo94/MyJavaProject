package unit3_fundamentals.challenges;

import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {
//        Exercise 1
//
//        Write a program which prints numbers from 89 to 117.

        int i = 88;

        while (i < 117) {
                i++;
                System.out.println(i);
            }
        exercise2();
        exercise3();
    }
    public static void exercise2() {
//        Exercise 2
//
//        Write a program which prints numbers from 1 to 40. After every third number, print “Quack.”.
        int i = 1;

        while (i < 40) {

            i++;
            System.out.print(i);
            if (i % 3 == 0) {
                System.out.print("Quack");
            }
        }

    }
        public static void exercise3() {
//            Exercise 3
//
//            Write a program which asks the user for a password. Make the password “shark50”.
//            Each time the user enters the password incorrectly, prompt them for a
//            password again. When the user enters the password correctly, print “ACCESS APPROVED”.
            Scanner scanner = new Scanner(System.in);
            String guess;

            do  {
                System.out.print("\n Please enter the password: ");
                guess = scanner.next();
                System.out.println("That is incorrect, please try again.");
            } while (!guess.equals("shark59"));

            if (guess.equals("shark59")) {
                System.out.println("ACCESS APPROVED.");
            }

        }


}

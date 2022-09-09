package unit3_fundamentals;


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WhileLoops {
    public static void main(String[] args) {

        int i = 0;
        // will repeat until the statement is false
        while (i < 10) {
            System.out.println("Test");
            i++;
        }


    forloop();
        breakStatement();
       doWhileLoop();
    }

    public static void forloop() {

        for (int i = 0; i < 10; i++) {
            System.out.print(i);

        }
    }
    public static void breakStatement() {

        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break;
            }
            System.out.println();
            System.out.println(i);
        }
    }
    public static void doWhileLoop() {
        Scanner scanner = new Scanner(System.in);
        String again;

        do {
            int num = ThreadLocalRandom.current().nextInt(1, 7);
            System.out.println("You rolled a " + num + ".");
            System.out.print("Roll again? y/n: ");
            again = scanner.next();
        } while (again.equals("y"));

    }
}

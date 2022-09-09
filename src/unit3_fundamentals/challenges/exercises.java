package unit3_fundamentals.challenges;

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
}

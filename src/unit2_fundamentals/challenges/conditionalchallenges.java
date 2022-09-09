package unit2_fundamentals.challenges;
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
    }
}

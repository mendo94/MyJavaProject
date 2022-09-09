package unit3_fundamentals;

public class WhileLoops {
    public static void main(String[] args) {

        int i = 0;
        // will repeat until the statement is false
        while (i < 10) {
            System.out.println("Test");
            i++;
        }


    forloop();
        breakAndContinue();
    }

    public static void forloop() {

        for (int i = 0; i < 10; i++) {
            System.out.print(i);

        }
    }
    public static void breakAndContinue() {

        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break;
            }
            System.out.println();
            System.out.println(i);
        }
    }

}

package unit4_fundamentals;

public class passData {
    public static void main(String[] args) {
        foo(10);
        System.out.println(bar());
    }

    public static void foo(int a) {
        if (a < 5) {
            return;
        }
        System.out.println(a);
    }
    public static int bar() {
    return 49;
    }
}

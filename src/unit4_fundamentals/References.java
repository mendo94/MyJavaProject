package unit4_fundamentals;

public class References {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        int[] x = {20, 22, 4, 16, 8};
        int[] y = (x);
        x[3] = 9;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println();

        for (int i = 0; i< x.length; i++) {
            System.out.println("x [" + i + "]" + x[i]);

        }
        System.out.println();

        for (int i = 0; i< y.length; i++) {
            System.out.println("y [" + i + "]" + y[i]);

        }
        System.out.println();

    }
}

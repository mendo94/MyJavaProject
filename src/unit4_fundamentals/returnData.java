package unit4_fundamentals;

public class returnData {
    public static void main(String[] args) {
        System.out.println(add(13,6));
        System.out.println(add(413,96) * add(413,96));
        System.out.println(add(add(413,96), add(413,96)));
        System.out.println(coneVolume(4,5));

    }

    public  static int add(int a, int b) {
        return a + b;
    }

    public static double coneVolume(double r, double h) {
        return Math.PI * r * r * h / 3;
    }
}

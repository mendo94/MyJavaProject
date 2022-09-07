package unit1_fundamentals;

public class Variables {
    public static void main(String[] args) {
        //primitive data types: byte, short, int, long, float, double, boolean, char
        int guitar = 20;
        System.out.println(guitar + 6);
        shorty();
    }

    public static void shorty() {
       System.out.println(15 / 2); // if written like this, then the output will not be a decimal
        System.out.println(15.0 / 2); // write the number as a double, so it does not round
    }
}



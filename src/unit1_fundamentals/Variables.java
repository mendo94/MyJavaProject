package unit1_fundamentals;

public class Variables {
    public static void main(String[] args) {
        //primitive data types: byte, short, int, long, float, double, boolean, char
        int guitar = 20;
        System.out.println(guitar + 6);
        shorty();
        dataTypes();
        descriptiveVariableNames();
        typeCasting();
    }

    public static void shorty() {
       System.out.println(15 / 2); // if written like this, then the output will not be a decimal
        System.out.println(15.0 / 2); // write the number as a double, so it does not round
    }

    public static void dataTypes() {
       int a = 27;
       double b = 14.27;
       boolean c = false;
       char d = '\u005A'; //capital z
       System.out.println(d);
       String e = "The sky is blue";
       System.out.println(e); //string is many characters, char is just one.
        String f = "Rina";
        System.out.println("My name is " + f); //string is many characters, char is just one.
    }

    public static void descriptiveVariableNames() {
      int age = 27;
      double statueHeightInMeters = 14.27;
      boolean hasDriversLicense = true;
      String name = "fruit flies";
      System.out.println("There are so many " + name);
    }

    public static void typeCasting() {
       int foo = 5;
       double bar = foo; //java wont convert to an unit because it may lose data, so explicity cast it to an int
        System.out.println(foo);
        System.out.println(bar);
        double fooo = 5.95;
        double barr = (int)foo; //java wont convert to an unit because it may lose data, so explicity cast it to an int
        System.out.println(fooo);
        System.out.println(barr);
    }
}



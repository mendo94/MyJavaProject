package unit2_fundamentals;
import java.util.Scanner;

public class formatMethod {
    public static void main(String[] args) {
        System.out.println(4.5 - 2.7);
        System.out.format("\nWhen formatted: %.1f\n", 4.5 - 2.7);
        System.out.format("I have %d dog, %d cats, 1 %s.", 1, 0, "family\n"); //works just like print but you can use a format specifier
        // %d are for integers and %s are for strings
        System.out.format("\nI have %.3f dog, %d cats, 1 %s.", 7.8, 0, "family");
    }
}

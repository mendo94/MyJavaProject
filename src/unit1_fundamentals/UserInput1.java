import java.util.Scanner;

public class UserInput1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        String input = sc.nextLine();
        System.out.printf("You entered %s", input);
    }
}

//to run this program instead of the first file, Random, you must right click on this document
//then select run UserInput1. Then you can click the run button like normal

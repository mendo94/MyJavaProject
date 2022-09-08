package unit2_fundamentals.challenges;


import java.util.Scanner;
//Exercise 2
//
//        Write a program which divides a restaurant bill so that each person pays an equal amount. Take a look at the hints below if you get stuck.
//
//        Hint 1: Prompt the user for the necessary input. Then do some calculation with that input, and print the result.
//
//        Hint 2: Using the Scanner, ask for the bill total and the number of people it will be split between.
//
//        Hint 3: Divide the bill total by the number of people to calculate how much each person should pay, and print the result.
public class bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's split up your restaurant bill, how much is the total: ");
        double totalBill = scanner.nextDouble();

        System.out.println("How many people are in your party:  ");
        int numberOfPeople = scanner.nextInt();

        double splitBill = totalBill / numberOfPeople;

        System.out.format("Your group of %d must each pay $%.2f towards the bill.",numberOfPeople, splitBill);
    }
}


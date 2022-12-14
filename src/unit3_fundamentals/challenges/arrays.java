package unit3_fundamentals.challenges;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
//        Exercise 1
//
//        Create an integer array of 10 elements and give each element an
//        arbitrary value. Print out the entire array using a loop.

        int [] foo = {1,2,3,4,45, 6,7,8,9,10};
        for (int i = 0; i < 10; i++) {
            System.out.println(foo[i]);
        }

//        Exercise 2
//
//        Use a loop to populate an array with integers from 1 to 20.
//        Use another loop to print the contents of the array (the elements) backwards.
        for (int i = foo.length - 1; i >= 0; i--) {
            System.out.println(foo[i]);
        }

//        Exercise 3
//
//        Create an array of five doubles and give each element some value.
//        Calculate the sum of all the elements and print the result.
//                Calculate the mean/average of the all the elements and print that too.

        double[] doubles = new double[] {1,2,3,4.22,5,55.55};
        double sumOfElements = 0;

        for (int i = 0; i < doubles.length; i++) {
            sumOfElements = sumOfElements + doubles[i];
            System.out.println(sumOfElements);
        }
        double mean = (double)sumOfElements / doubles.length;
        System.out.println("the average is: " + mean);
        favoriteFoods();

    }

    public static void favoriteFoods() {
//        Exercise 4
//
//        Write a program which asks the user to enter their top five favourite foods and store
//        their answers in a string array. However, create the array so it can only hold a maximum of three
//        strings. After the user enters the third
//        item, print “No more memory available.”, then print out the contents of the array.

        Scanner scanner = new Scanner(System.in);

        String[] favoriteFood = new String[3];

        for (int i = 0; i < favoriteFood.length; i++) {
            System.out.print("Enter your favorite foods: ");
            favoriteFood[i] = scanner.nextLine();
        }

        System.out.println("No more memory available.");

        for (int i = 0; i < favoriteFood.length; i++) {
            System.out.println(favoriteFood[i]);
        }




    }
}

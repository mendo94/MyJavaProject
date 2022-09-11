package unit3_fundamentals;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //iterate through an array
        int[] b = {75, 29, 350, 7, 1929, 990};
        b[3] = 51;
        System.out.print(b[3]);
        for (int i = 0 ; i < b.length; i++) {
            System.out.println(b[i]);
        }

        //looping through backwards
        int[] a = {5, 75, 29, 350, 7, 1929, 990};
        for (int i = a.length -1; i >= 0; i--) {
            System.out.println(a[i]);
        }
        processingArrays();
        sizesTypesFortunes();
        raceCars();

    }

    //only numbers greater than 100 will be printed.
    public static void processingArrays() {
        int[] nums = {1,2,3,4,5,6,7, 100, 200, 3000, 900};
        int count = 0; //keep count of how many numbers are greater than 100.
        int sumOfNums = 0; //find the mean or average

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 100) {
                count++;
                System.out.print(nums[i]);
            }
            sumOfNums = sumOfNums + nums[i];
        }
            System.out.println("Number of values greater than 100 are " + count);
       double mean = (double)sumOfNums / nums.length;
        System.out.println("The mean is" + mean);
    }

    public static void sizesTypesFortunes() {
        Scanner scanner = new Scanner(System.in);
        //changing the size of the an array
        double[] foo = {1,8,56.556,56.75,8,5.67,456756,987};
        double[] bar = new double[100]; //write the size of an array here

        String[] predictions = new String[3];
        predictions[0] = "a pioneer";
        predictions[1] = "loved by many";
        predictions[2] = "going straight to hell";

        System.out.print("I will predict your future, Choose 1, 2, or 3: ");
        int choice = scanner.nextInt();

        System.out.println("In your future you will be " + predictions[choice -1]);

    }

    public static void raceCars() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of laps: ");
        int numberOfLaps = scanner.nextInt();

        double[] lapTimes = new double[numberOfLaps];

        for (int i = 0; i < numberOfLaps; i++) {
            System.out.println("Lap time: ");
            lapTimes[i] = scanner.nextDouble();
        }

        double fastestTime = lapTimes[0];
        for (int i = 1; i < lapTimes.length; i++) {
            if (lapTimes[i] < fastestTime) {
                fastestTime = lapTimes[i];
            }
        }
            System.out.println("Fastest time: " + fastestTime);

    }
}

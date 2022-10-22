package PrimeNumbers;

public class PrimeNumbers {
    public static void main(String[] args) {

        int x = 100;




        for (int num = 2; num < 1000; num++) {
        boolean isPrime = true;

            for (int div = 2; div < num; div++) {

                if (num % div == 0) {

                    isPrime = false;
                    break;

                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            }
        }
    }
    /*
     * Method overloading is when multiple methods can have the same name with different parameters
     *
     * Method Scope variables are only assessible inside the region they are created is java scope. Method scope variables declared directly inside a method are avaiable anywhere in the method following the line of code in which they were declared.
     *
     * */

}





package PrimeNumbers;

public class PrimeNumbers {
    public static void main(String[] args) {

        int num = 1;
        boolean isPrime = true;

        for (int div = 2; div < num; div++) {

          if  (num % div ==0) {

                isPrime = false;
                break;

            }
        }
        if (isPrime) {
            System.out.println("Is prime");
        } else {
            System.out.println("Not prime");
        }
    }
}

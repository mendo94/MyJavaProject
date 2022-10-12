package PrimeNumbers;

public class PrimeNumbers {
    public static void main(String[] args) {

        int num = 9;
        boolean isPrime;

        for (int div = 2; div < num; div++) {

          if  (num % div ==0) {
                System.out.println("Not prime");
                break;

            }
        }
    }
}

package unit3_fundamentals;

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
}

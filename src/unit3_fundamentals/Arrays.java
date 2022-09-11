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

    }
}

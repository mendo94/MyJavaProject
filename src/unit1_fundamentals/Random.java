package unit1_fundamentals;

public class Random {
    public static void main(String[] args) {
        hazelnut();
        System.out.println("Chocolate Sauce");
        System.out.println("Strawberry Sauce");
        hazelnut(); //method call - the hazelnut method will not run if we did not tell the program to only this first method will run
    }

    public static void hazelnut() {
        System.out.println("Tree");
        System.out.println("Grass");
    }
}
package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        Scanner scanner = new Scanner(System.in);
        int input;
        char turn = 'X';


        while (true) {
            do {

            System.out.print("Enter a position: ");
            input = scanner.nextInt();
            } while (pos[input -1] == 'X' || pos[input -1] =='O');

            pos[input - 1] = turn;


            System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");

            if (turn == 'X') {
                turn = 'O';
            } else if (turn == 'O') {
                turn = 'X';
            }
        }
    }
}

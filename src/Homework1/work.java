package Homework1;
import java.util.Scanner;

public class work {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;
        System.out.print("How many phrases will you enter? ");
        int roundgoal = input.nextInt();
        int rounds = 0;
        String input1 = "";

        while (rounds < roundgoal) {
            System.out.print("Tell me something. ");
            input1 = input.next();
            total += input1.length();
            rounds++;
        }
        if (rounds == roundgoal) {
            System.out.println("You have entered " + total + " characters.");
        }
    }
}


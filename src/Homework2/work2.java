package Homework2;
import java.util.Scanner;

public class work2 {
    public static int askInt() {
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.print("Please enter an integer or q to quit: ");
        String input1 = input.next();
        while (!input1.equals("q")) {
            int intInput = Integer.parseInt(input1);
            if (intInput > 10 && intInput < 15) {
                total++;
            }
            System.out.print("Please enter an integer or q to quit: ");
            input1 = input.next();
        }

        return total;
    }

    public static void main(String[] args) {
        int number = askInt();
        System.out.println("Number in range is " + number);
    }
}
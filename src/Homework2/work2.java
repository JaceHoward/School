package Homework2;
import java.util.Scanner;

public class work2 {

    public static String askInt() {

        Scanner input = new Scanner(System.in);
        int total = 0;
        String input1 = "";
        if (!input1.equals("q")) {
            do {
                System.out.print("Please enter an integer or q to quit: ");
                input1 = input.next();
                int intInput = Integer.parseInt(input1);
                if (intInput > 10 && intInput < 15) {
                    total++;
                }
            }
            while (!input1.equals("q"));
            return ("Number in range is " + total);
        } else {
            return ("Number in range is " + total);
        }
    }
    public static void main(String[] args) {
        askInt();
        System.out.println(askInt());
    }
}
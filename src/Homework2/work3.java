package Homework2;
import java.util.Scanner;

public class work3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of credit hours the student has earned: ");
        int creditHours = input.nextInt();
        String classification;
        if (creditHours < 30) {
            classification = "Freshman";
        } else if (creditHours < 60) {
            classification = "Sophomore";
        } else if (creditHours < 90) {
            classification = "Junior";
        } else {
            classification = "Senior";
        }
        System.out.println(classification);
    }
}
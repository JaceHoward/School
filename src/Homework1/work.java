package Homework1;
import java.util.Scanner;

public class work {
    public static void main(String[] args) {
        double distance = 10 / 0.7;
        int day = 0;
        double gained = distance;
        do {
           day ++;
           gained *= 0.7;
           double total = distance + gained;
            System.out.println("Day " + day + " distance today = " + gained + "   total = " + total);
        }
        while (gained > 0.1);
        }
    }
    //use .equals for testing equality of strings
    // a.compareto(b) to test <> of strings

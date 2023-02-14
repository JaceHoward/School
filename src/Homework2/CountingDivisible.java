package Homework2;

public class CountingDivisible {

    public static int countDivisibleNumbers(int divisor) {
        int count = 0;
        for (int number = 1; number <= 100; number++) {
            if (number % divisor == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int test = 25;
        int total = countDivisibleNumbers(test);
        System.out.println("The total number of numbers between 1 and 100 that are divisible by " + test + " is " + total);
        }
    }


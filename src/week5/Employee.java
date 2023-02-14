package week5;
import java.util.Arrays;
public class Employee {
    public static void main(String[] args) {

        double [] temperatures = {2.3, 1, -4.2};
        double temperature[] = {2.3, 1, -4.2};

        System.out.println(Arrays.toString(temperatures));
        int[] intArray = new int[5];
        System.out.println(Arrays.toString(intArray));
        // System.out.println(temperatures[3]); for index
        String str = "abcd";
        System.out.println("Length of string: " + str.length());
        System.out.println("Length of array: " + temperatures.length);


        System.out.println(("last elemenet " + temperatures[temperatures.length - 1]));
    }
}

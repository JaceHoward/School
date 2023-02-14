package week5;

import java.util.Arrays;

public class FridayExercise {
    public static int[] rotate(int[] array) {
        int lastValue = array[array.length - 1];
        for (int index = array.length - 2; index >= 0; index--) {
            array[index + 1] = array[index];
        }
        array[0] = lastValue;
        return array;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(rotate(test)));
    }
}

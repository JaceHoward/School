package ClassWork;

public class sum_range {
    public static int sumTheRange(int begin, int end) {
        int sum = 0;
        for (int number = begin; number <= end; number++) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumTheRange(2, 4));
        System.out.println(sumTheRange(2, 10));
        System.out.println(sumTheRange(1, 2));
    }
}
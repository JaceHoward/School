package Homework2;


public class IsBetween {
    public static boolean isBetween(String first, String second, String third) {
        return (first.compareTo(second) < 0
                && second.compareTo(third) < 0);
    }

    public static void main(String[] args) {
        System.out.println(isBetween("hard place", "man", "rock"));
        System.out.println(isBetween("Java", "IntelliJ", "IDE"));
        System.out.println(isBetween("a cup", "a slip", "a lip"));
        System.out.println(isBetween("this", "this", "that"));
    }

}


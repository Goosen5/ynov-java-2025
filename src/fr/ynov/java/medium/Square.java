package fr.ynov.java.medium;

public class Square {
    public static void main(String[] args) {
        Integer i;
        if (args.length == 1) {
            i = Integer.parseInt(args[0]);
        } else {
            System.out.println("Please enter a number");
            i = Integer.valueOf(System.console().readLine());
        }
        System.out.println(square(i));
    }
    public static int square(int i) {
        return i * i;
    }
}

package fr.ynov.java.easy;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to check: ");
        int number = Integer.parseInt(System.console().readLine());
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }
    }
}

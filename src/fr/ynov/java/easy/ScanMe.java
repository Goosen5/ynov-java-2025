package fr.ynov.java.easy;

public class ScanMe {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        String name = System.console().readLine();
        System.out.println("How old are you?");
        int age = Integer.parseInt(System.console().readLine());
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
    }
}

package fr.ynov.java.easy;

public class Calculator {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments."); // verify that the user has provided two args
            return;
        }

        double num1, num2;
        try {
            // parse the args as doubles
            num1 = Double.parseDouble(args[0]);
            num2 = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please provide valid numbers."); // verify that the args are numbers
            return;
        }

        System.out.println("Enter an operator (+, -, *, /): ");
        String operator = System.console().readLine(); // read the operator from the console

        double result;
        switch (operator) { // perform the operation based on the operator
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero."); // verify that the user is not dividing by zero
                    return;
                }
                result = num1 / num2;
                break;
            default: // if the operator is invalid, print an error message
                System.out.println("Invalid operator. Please use one of +, -, *, /.");
                return;
        }

        System.out.println("The result of the operation is: " + result);
    }
}

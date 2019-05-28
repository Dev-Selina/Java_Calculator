package calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorMain resultsFromCalc = new CalculatorMain();
        resultsFromCalc.inputNumbers();
    }

    private void inputNumbers() {
        Scanner fromScanner = new Scanner(System.in);
        int result = 0;

        while (result >= 0) {
            System.out.println("\nPlease enter first value");
            int firstNumber = fromScanner.nextInt();
            System.out.println("Please enter a Math operation:\n+ \n- \n/ \nx");
            String mathOperation = fromScanner.next();
            System.out.println("please enter second value");
            int secondNumber = fromScanner.nextInt();

            switch (mathOperation) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "/":
                    result = firstNumber / secondNumber;

                    break;
                case "x":
                    result = firstNumber * secondNumber;
                    break;
                default:
                    System.out.println("Sorry I did not understand the operation selected. Please try again");
                    break;

            }
            System.out.printf(firstNumber + " " + mathOperation + " " + secondNumber + " = " + result + "\n");

        }
    }

}

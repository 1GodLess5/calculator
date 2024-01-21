package cz.godless;

import cz.godless.calculator.AbstractCalculator;
import cz.godless.calculator.CalculatorHolder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static CalculatorHolder calculatorHolder = new CalculatorHolder();
    public static void main(String[] args){
        do {
            System.out.println("Write number, then type of operation (+, -, *, /) and then write number again.");
            double leftNumber;
            double rightNumber;
            char operator;

            while (true){
                try {
                    System.out.print("First number: ");
                    leftNumber = scanner.nextDouble();
                    System.out.print("Operation: ");
                    operator = scanner.next().charAt(0);
                    if (operator != '+' && operator != '-' && operator != '*' && operator != '/'){
                        System.out.println("Invalid input.");
                        continue;
                    }
                    System.out.print("Second number: ");
                    rightNumber = scanner.nextDouble();

                    break;
                } catch (InputMismatchException e){
                    System.out.println("Invalid input.");
                    scanner.nextLine();
                }
            }

            final Operands operands = new Operands(leftNumber, rightNumber);
            final AbstractCalculator calculator = calculatorHolder.getSuitableCalculator(operator);
            calculator.calculate(operands, operator);
        } while (true);
    }
}

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
            final double leftNumber, rightNumber;
            final ArithmeticOperator operator;

            try {
                System.out.print("First number: ");
                leftNumber = scanner.nextDouble();
                System.out.print("Operation: ");
                final String line = scanner.next();
                operator = ArithmeticOperator.getFromSymbol(line);
                System.out.print("Second number: ");
                rightNumber = scanner.nextDouble();
            } catch (InputMismatchException | IllegalArgumentException e){
                System.out.println("Invalid input.");
                scanner.nextLine();
                continue;
            }


            final Operands operands = new Operands(leftNumber, rightNumber);
            final AbstractCalculator calculator = calculatorHolder.getSuitableCalculator(operator);
            calculator.calculate(operands, operator);
        } while (true);
    }
}

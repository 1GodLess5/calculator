import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        do {
            System.out.println("Write number, then type of operation (+, -, *, /) and then write number again.");
            double leftNumber;
            double rightNumber;
            char operation;

            while (true){
                try {
                    System.out.print("First number: ");
                    leftNumber = scanner.nextDouble();
                    System.out.print("Operation: ");
                    operation = scanner.next().charAt(0);
                    if (operation != '+' && operation != '-' && operation != '*' && operation != '/'){
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

            System.out.println("Left: " + operands.getLeftNumber() + ", operation: " + operands.getRightNumber() + ", right: " + rightNumber);
        } while (true);
    }
}

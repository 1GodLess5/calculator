package cz.godless.operation;

public class Substraction implements Operation {
    @Override
    public double calculate(double leftNumber, double rightNumber) {
        return  leftNumber - rightNumber;
    }
}

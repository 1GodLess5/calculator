package cz.godless.operation;

public class Addition implements Operation {

    @Override
    public double calculate(double leftNumber, double rightNumber) {
        return leftNumber + rightNumber;
    }
}

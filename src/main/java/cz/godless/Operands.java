package cz.godless;

public class Operands {
    private final double leftNumber;
    private final double rightNumber;

    public Operands(double leftNumber, double rightNumber) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
    }

    public double getLeftNumber() {
        return leftNumber;
    }

    public double getRightNumber() {
        return rightNumber;
    }
}

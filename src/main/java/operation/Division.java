package operation;

public class Division implements Operation {
    @Override
    public double calculate(double leftNumber, double rightNumber) {
        if (rightNumber == 0){
            return 0;
        }
        return leftNumber / rightNumber;
    }
}

package cz.godless.calculator;

import cz.godless.ArithmeticOperator;
import cz.godless.operation.Operation;

import java.util.Map;

public class AdvancedCalculator extends AbstractCalculator {
    public AdvancedCalculator(String name, Map<ArithmeticOperator, Operation> operationMap) {
        super(name, operationMap);
    }
}

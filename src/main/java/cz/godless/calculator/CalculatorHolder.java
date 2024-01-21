package cz.godless.calculator;

import cz.godless.ArithmeticOperator;
import cz.godless.operation.*;

import java.util.HashMap;
import java.util.Map;

public class CalculatorHolder {
    private BasicCalculator basicCalculator;
    private AdvancedCalculator advancedCalculator;

    public CalculatorHolder(){
        this.initalizeCalculators();
    }

    private void initalizeCalculators(){
        final Map<ArithmeticOperator, Operation> basicCalculatorOperationMap = new HashMap<>();
        basicCalculatorOperationMap.put(ArithmeticOperator.ADDITION, new Addition());
        basicCalculatorOperationMap.put(ArithmeticOperator.SUBTRACTION, new Substraction());
        this.basicCalculator = new BasicCalculator("BasicCalculator", basicCalculatorOperationMap);

        final Map<ArithmeticOperator, Operation> advancedCalculatorOperationMap = new HashMap<>();
        advancedCalculatorOperationMap.put(ArithmeticOperator.MULTIPLICATION, new Multiplication());
        advancedCalculatorOperationMap.put(ArithmeticOperator.DIVISION, new Division());
        this.advancedCalculator = new AdvancedCalculator("AdvancedCalculator", advancedCalculatorOperationMap);
    }

    public AbstractCalculator getSuitableCalculator(ArithmeticOperator operator){
        switch (operator){
            case ADDITION, SUBTRACTION -> {
                return basicCalculator;
            }
            case MULTIPLICATION, DIVISION -> {
                return advancedCalculator;
            }
            default -> throw new IllegalArgumentException("Unsupported operation.");
        }
    }
}

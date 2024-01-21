package cz.godless.calculator;

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
        final Map<Character, Operation> basicCalculatorOperationMap = new HashMap<>();
        basicCalculatorOperationMap.put('+', new Addition());
        basicCalculatorOperationMap.put('-', new Substraction());
        this.basicCalculator = new BasicCalculator("BasicCalculator", basicCalculatorOperationMap);

        final Map<Character, Operation> advancedCalculatorOperationMap = new HashMap<>();
        advancedCalculatorOperationMap.put('*', new Multiplication());
        advancedCalculatorOperationMap.put('/', new Division());
        this.advancedCalculator = new AdvancedCalculator("AdvancedCalculator", advancedCalculatorOperationMap);
    }

    public AbstractCalculator getSuitableCalculator(char operator){
        switch (operator){
            case '+', '-' -> {
                return basicCalculator;
            }
            case '*', '/' -> {
                return advancedCalculator;
            }
            default -> throw new IllegalArgumentException("Unsupported operation.");
        }
    }
}

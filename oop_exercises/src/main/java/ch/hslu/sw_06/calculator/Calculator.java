package ch.hslu.sw_06.calculator;

public class Calculator implements Calculating {
    @Override
    public int sumUp(int operand_1, int operand_2) {
        return Math.addExact(operand_1, operand_2);
    }
}

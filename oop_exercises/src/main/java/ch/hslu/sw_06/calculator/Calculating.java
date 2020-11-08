package ch.hslu.sw_06.calculator;

/**
 * Providing basic calculation functionality such as addition, subtraction, multiplication and division.
 * @author Nicolas Vondru
 * @version 1.0
 * @since 23.10.2020
 */
public interface Calculating {

    /**
     * Returns the summed up value for two passed Integer values, which is also an Integer.
     * @param operand_1 First value to be summed up.
     * @param operand_2 Second value to be summed up.
     * @return Summed up value from operand_1 and operand_2.
     */
    public int sumUp(int operand_1, int operand_2);

}

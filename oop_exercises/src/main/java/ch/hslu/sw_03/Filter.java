package ch.hslu.sw_03;

/**
 * Abstract class containing static functions to filter elements.
 * @author Nicolas Vondru
 * @version 1.0
 * @since 18.10.2020
 */
public abstract class Filter {

    /**
     * Returns the largest int value within the passed array, defaults to 0.
     * @param numbers Array of int numbers, which will be filtered.
     * @return The largest int value within the passed array.
     */
    public static int FILTER_MAX(int[] numbers){
        int max = 0;
        for (int x = 0; x < numbers.length; x ++){
            int currentNumber = numbers[x];
            if (currentNumber > max) {
                max = currentNumber;
            }
        }
        return max;
    }
}

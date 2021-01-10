package ch.hslu.sw_03.iterations;

public class IterationDemo {

    public static void main(String[] args) {
        // Exercise 2 - a)
        System.out.println("----- Exercise 2 - a) -------");
        for (int x = 0; x <= 10; x ++){
            System.out.println(x);
        }

        // Exercise 2 - c)
        System.out.println("----- Exercise 2 - c) -------");
        float number = 0.9f;
        while (number < 1){
            number += 0.000025f;
        }
        System.out.println(number);

        // Exercise 2 - d)
        System.out.println("----- Exercise 2 - d) -------");
        float number2 = 0.9f;
        float counter = 0;
        while (number2 < 1){
            number2 += 0.000025f;
            counter ++;
        }
        System.out.println(number2);
        System.out.println(counter);

        // Exercise 2 - e)
        System.out.println("----- Exercise 2 - e) -------");
        float number3 = 0.9f;
        for (int x = 1; x <= 4000; x ++){
            number3 += 0.000025f;
            System.out.println(x + " " + number3);
        }

    }

}

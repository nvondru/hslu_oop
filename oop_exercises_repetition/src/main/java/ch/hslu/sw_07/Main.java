package ch.hslu.sw_07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Temperature higher = new Temperature(150f);
        Temperature lower = new Temperature(100f);
        Temperature mid = new Temperature(120f);

        ArrayList<Temperature> temps = new ArrayList<>();

        temps.add(higher);
        temps.add(lower);
        temps.add(mid);

        System.out.println(temps);

        //Collections.sort(temps); --> uses the compareTo() function of class Temperature
        //Collections.sort(temps, new KelvinComparator()); --> uses the logic within compare() from KelvinComparator class


        //temps.sort(); --> alternate way to sort
        temps.sort(new KelvinComparator());

        System.out.println(temps);

    }
}

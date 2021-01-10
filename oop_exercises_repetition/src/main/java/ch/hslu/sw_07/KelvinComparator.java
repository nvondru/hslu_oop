package ch.hslu.sw_07;

import java.util.Comparator;

public class KelvinComparator implements Comparator<Temperature> {

    @Override
    public int compare(Temperature temp1, Temperature temp2) {
        return Float.compare(temp1.getKelvin(), temp2.getKelvin());

    }
}

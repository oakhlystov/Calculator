package org.example.calculations;

import java.util.Arrays;

public class ArrayPrettifyer {
    public String[] deleteNullsFromArray(String[] array, int counter) {
        return Arrays.copyOf(array, counter);
    }
}

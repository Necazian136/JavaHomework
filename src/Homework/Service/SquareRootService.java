package Homework.Service;


import Homework.Exception.NegativeNumberException;

import java.util.ArrayList;
import java.util.List;


public class SquareRootService {
    protected Double getRoot(Integer value) {
        return Math.sqrt(value);
    }

    protected Boolean isValid(Double value) {
        return value % 1 == 0;
    }

    protected Integer[] generateArray(Integer N, Integer min, Integer max) {
        Integer[] arr = new Integer[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * ((max - min) + 1)) + min;
        }
        return arr;
    }

    public List<Integer> getRightNumbers(Integer N, Integer min, Integer max) throws NegativeNumberException {
        List<Integer> rightNumbers = new ArrayList<>();
        for (Integer i : this.generateArray(N, min, max)) {
            if (i < 0) {
                throw new NegativeNumberException();
            }
            if (this.isValid(this.getRoot(i))) {
                rightNumbers.add(i);
            }
        }
        return rightNumbers;
    }
}
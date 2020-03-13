package Homework.Sorting;

import Homework.Context.Context;

import java.util.List;

public abstract class AbstractSort<T> {
    abstract public List<T> sort(List<T> list, Context<T> context);

    public boolean isSorted(List<T> list, Context<T> context) {
        boolean isSorted = true;
        for (int i = 0; i < list.toArray().length - 1; i++) {
            if (context.compare(list.get(i), list.get(i + 1)) > 0) {
                isSorted = false;
            }
        }
        return isSorted;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

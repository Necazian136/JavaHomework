package Homework.Sorting;

import Homework.Context.Context;

import java.util.List;

public class BubbleSort<T> extends AbstractSort<T> {
    @Override
    public List<T> sort(List<T> list, Context<T> context) {
        for (int i = 0; i < list.toArray().length; i++) {
            for (int j = 0; j < list.toArray().length - 1; j++) {
                T first = list.get(j);
                T second = list.get(j + 1);
                if (context.compare(first, second) > 0) {
                    list.set(j + 1, first);
                    list.set(j, second);
                }
            }
        }
        return list;
    }
}

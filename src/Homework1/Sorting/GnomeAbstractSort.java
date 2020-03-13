package Homework1.Sorting;

import Homework1.Context.Context;

import java.util.List;

public class GnomeAbstractSort<T> extends AbstractSort<T> {
    @Override
    public List<T> sort(List<T> list, Context<T> context) {
        int listLength = list.toArray().length;
        for (int i = 0; i < listLength; i++) {
            T glass = list.get(i);
            int minPosition = this.findMin(list, context, i, listLength);
            list.set(i, list.get(minPosition));
            list.set(minPosition, glass);
        }
        return list;
    }

    private int findMin(List<T> list, Context<T> context, int from, int to) {
        T min = list.get(from);
        int minPosition = from;
        for (int i = from; i < to; i++) {
            if (context.compare(min, list.get(i)) > 0) {
                min = list.get(i);
                minPosition = i;
            }
        }
        return minPosition;
    }
}

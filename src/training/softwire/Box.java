package training.softwire;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Countable> implements Countable {
    List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    @Override
    public int getCount() {
        int total = 0;

        for (T item : items) {
            total += item.getCount();
        }

        return total;
    }
}

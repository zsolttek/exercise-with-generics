package training.softwire;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Countable{
    List<Box> boxes = new ArrayList<>();

    public void add(Box box) {
        boxes.add(box);
    }

    @Override
    public int getCount() {
        int total = 0;
        for(Box box : boxes) {
            total += box.getCount();
        }

        return total;
    }
}

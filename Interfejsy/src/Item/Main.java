package Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item i1 = new Item("ołówek", 1, 1.50);
        Item i2 = new Item("gumka", 0.75, 0.50);
        Item i3 = new Item("linijka", 0.5, 1.00);
        Item i4 = new Item("długopis", 2, 2.50);
        Item[] items = {i1, i2, i3, i4};
        System.out.println(Arrays.toString(items));
        Arrays.sort(items);
        System.out.println(Arrays.toString(items));
    }
}

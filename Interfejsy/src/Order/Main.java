package Order;

import java.awt.image.ColorConvertOp;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<Order>();
        orders.add(new Order("Mleko", 100, 5.50));
        orders.add(new Order("Ser", 80, 8.50));
        orders.add(new Order("Szynka", 120, 5.50));
        orders.add(new Order("Woda", 600, 0.99));
        orders.add(new Order("Masło", 50, 4.40));
        System.out.println(orders);
        Collections.sort(orders);
        System.out.println(orders);
    }
}

package Order;

public class Order implements Comparable<Order>{
    String productName;
    int quantity;
    double unitPrice;

    Order(String productName, int quantity, double unitPrice){
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Order: " + productName + ", ilość: " + quantity + ", cena: " + unitPrice + ".";
    }

    @Override
    public int compareTo(Order o) {
        if(Double.compare(o.unitPrice, this.unitPrice)==0)
            return Double.compare(this.quantity, o.quantity);
        else {
            return Double.compare(o.unitPrice, this.unitPrice);
        }
    }
}

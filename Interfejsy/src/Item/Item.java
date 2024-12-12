package Item;

public class Item implements Comparable<Item>{
    String name;
    double weight;
    double price;

    Item(String name, double weight, double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item: "+name+", waga: "+weight+", cena: "+price+". ";
    }


    @Override
    public int compareTo(Item o) {
        return Double.compare(this.weight, o.weight);
    }
}

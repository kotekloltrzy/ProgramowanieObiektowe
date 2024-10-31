package Tool;

public class Main {
    public static void main(String[] args) {
        Tool t1 = new Hammer("Młotek");
        t1.przeczytajNazwe();
        Tool t2 = new Tool("Śrubokręt");
        t2.przeczytajNazwe();
    }
}

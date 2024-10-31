package Computer;

public class Main {
    static double[] ceny = {12.45, 21.37, 98.76};

    public static void main(String[] args) {
        Computer c1 = new Computer("Lenova", "ultra", ceny);
        c1.toString();
    }
}

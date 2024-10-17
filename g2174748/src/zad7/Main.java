package zad7;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(10, 50);
        Time time2 = new Time(5, 30);

        Time result = Time.addTime(time1, time2);
//        result.displayTime(); // Powinno wyświetlić: 16:20
    }
}

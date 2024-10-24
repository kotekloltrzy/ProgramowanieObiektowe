import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<=5; i++){
            list.add(i);
        }
        Listy l = new Listy();
        System.out.println(l.average(list));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(2);
        list2.add(0);
        list2.add(3);
        list2.add(0);

        System.out.println(l.countZeros(list2));

    }
}
package MyComparator;

public class TestMyComparator implements MyComparator{
    @Override
    public int compare(int a, int b) {
        if(a<b) return -1;
        if(a==b) return 0;
        return 1;
    }

    public static void main(String[] args) {
        TestMyComparator t1 = new TestMyComparator();

        System.out.println(t1.compare(5,1));
        System.out.println(t1.compare(1,1));
        System.out.println(t1.compare(5,5));
    }
}

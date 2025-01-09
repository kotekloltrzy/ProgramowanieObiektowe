package Swap;

public class Main {

    public static <T> void swap(T[] array, int index1, int index2){
        if(index1 > array.length -1 || index1 < 0 || index2 > array.length -1 || index2 < 0){
            return;
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        swap(arr, 4, 9);
        for(int i: arr){
            System.out.println(i);
        }
    }
}

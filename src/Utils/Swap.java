package Utils;

public class Swap {

    public static void swap(Integer[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

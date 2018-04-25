package Sort;




import Utils.Swap;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        Integer[] arr = Utils.DataPreparationUtil.getPreparationData(10,20);
        System.out.println("before sort:" + Arrays.toString(arr));

        shellSort(arr);
        System.out.println("after sort:" + Arrays.toString(arr));
    }

    private static void shellSort(Integer[] arr) {
        for (int gap = arr.length/2; gap >= 1 ; gap/=2) {
            for (int i = gap; i < arr.length ; i++) {
                int j = i;
                while (j >= 0 && j -gap >=0 && arr[j]<arr[j-gap]) {
                    Swap.swap(arr,j,j-gap);
                    j -= gap;
                }
            }
        }
    }
}

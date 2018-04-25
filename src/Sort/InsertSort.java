package Sort;

import Utils.DataPreparationUtil;
import Utils.Swap;


import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        Integer[] arr = DataPreparationUtil.getPreparationData(10,20);
        System.out.println("Before sort:" + Arrays.toString(arr));

        insertSort(arr);
        System.out.println("After sort:" + Arrays.toString(arr));

    }

    private static void insertSort(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]) {
                Swap.swap(arr,j,j-1);
                j--;
            }
        }
    }
}

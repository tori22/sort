package Sort;

import Utils.DataPreparationUtil;
import Utils.Swap;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Integer[] arr = DataPreparationUtil.getPreparationData(10,20);
        System.out.println("before sort:" + Arrays.toString(arr));

        quickSort(arr);
        System.out.println("after sort:" + Arrays.toString(arr));
    }

    private static void quickSort(Integer[] arr) {

        partition(arr,0,arr.length-1);
    }

    private static void partition(Integer[] arr, int min, int max) {
        if (arr == null || min > max) return;;
        int temp = min-1;
        for (int i = min; i < max ; i++) {
            if (arr[i] <= arr[max]) {
                temp++;
                Swap.swap(arr,temp,i);
            }
        }
        temp++;
        Swap.swap(arr,temp,max);
        partition(arr,min,temp-1);
        partition(arr,temp+1,max);
    }
}

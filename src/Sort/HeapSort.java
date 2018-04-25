package Sort;

import Utils.DataPreparationUtil;
import Utils.Swap;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        Integer[] arr = DataPreparationUtil.getPreparationData(10,20);
        System.out.println("before sort:"+ Arrays.toString(arr));

        heapSort(arr);
        System.out.println("after sort:" + Arrays.toString(arr));
    }

    private static void heapSort(Integer[] arr) {
        for (int k = arr.length/2-1;k>=0;k--) {
            AdjustHeap(arr,k,arr.length);
        }
        for(int i = arr.length-1;i>0;i--) {
            Swap.swap(arr,i,0);
            AdjustHeap(arr,0,i);
        }
    }

    private static void AdjustHeap(Integer[] arr, int i, int length) {
        int temp = arr[i];
        for (int j = i*2+1; j < length ; j=j*2+1) {
            if (j+1<length && arr[j]<arr[j+1]) j++;
            if (arr[j] > temp) {
                Swap.swap(arr,i,j);
                i = j;
            } else break;
        }
    }
}

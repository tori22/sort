package Sort;

import Utils.DataPreparationUtil;
import Utils.Swap;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        Integer[] arr = DataPreparationUtil.getPreparationData(10,20);
        System.out.println("before sort:" + Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println("after sort:"+ Arrays.toString(arr));
    }

    private static void bubbleSort(Integer[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1])
                    Swap.swap(arr,j,j+1);
            }
        }
    }
}

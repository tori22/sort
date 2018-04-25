package Sort;

import Utils.DataPreparationUtil;
import Utils.Swap;
;import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {
        Integer[] arr= DataPreparationUtil.getPreparationData(10,20);
        System.out.println("before sort:" + Arrays.toString(arr));

        selectSort(arr);
        System.out.println("after sort:" + Arrays.toString(arr));
    }

    private static void selectSort(Integer[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    Swap.swap(arr,i,j);
            }
        }
    }
}

package Sort;

import Utils.DataPreparationUtil;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        Integer[] arr = DataPreparationUtil.getPreparationData(10,20);
        System.out.println("before sort:" + Arrays.toString(arr));

        mergeSort(arr,0,arr.length-1);
        System.out.println("after sort:" + Arrays.toString(arr));
    }

    private static void mergeSort(Integer[] arr, int left, int right) {
        if (arr == null || left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,right);
    }

    private static void merge(Integer[] arr, int left, int right) {
        int mid = (left + right) / 2;
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= right) {
            if (arr[i] < arr[j])
                temp[t++] = arr[i++];
            else
                temp[t++] = arr[j++];
        }

        while (i <= mid)
            temp[t++] = arr[i++];


        while(j <= right)
            temp[t++] = arr[j++];

        t = 0;
        while (left <= right) {
            arr[left++] = temp[t++];
        }
    }
}
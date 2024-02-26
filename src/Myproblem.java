import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Collections.swap;

public class Myproblem {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[correct] != correct) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        int start = 0;
        int end = arr.length;
        int mid = start + (end - start) / 2;
        boolean swapped;
        for (int k = 1; k < mid; k++) {
            swapped = false;
            for (int j = mid+1; j < arr.length; j++) {
                if (arr[j]< arr.length && arr[j ] < arr[j-1]) {
                    swap(arr, j, j-1);
                    swapped = true;

                }
            }
            if (!swapped) {
                break;
            }
        }
    }

     static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}

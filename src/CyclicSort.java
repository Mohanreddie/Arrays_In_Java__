import java.util.Arrays;
//cyclic sort can be  used when the array is ranges from (0 to n)
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={5,3,7,6,1,8,2,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
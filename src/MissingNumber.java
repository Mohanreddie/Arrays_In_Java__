// missing number asked by Amazon....
//code is done by using cyclic sort
//N = arr.length
public class MissingNumber {
    public static void main(String[] args) {
//        int[] arr={9,6,4,2,3,5,7,0,1};// Case-1----> where N is  present use(arr[i]< arr.length&&arr[correct]!=arr[i])
        int[] arr={1,-1,3,2};//case-2--> where N is not present Simply return N.
        System.out.println(cyclic(arr));

    }
    static int cyclic(int[] arr){
        int i=0;
        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0&&arr[i]< arr.length&&arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
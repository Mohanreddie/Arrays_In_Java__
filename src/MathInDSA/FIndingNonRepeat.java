package MathInDSA;

public class FIndingNonRepeat {
    public static void main(String[] args) {
        int[] arr={2,2,3,2,7,7,8,7,8,8,9,9,9,9,7,8,2,9,8,7,2};
        int n=5;//no.of repeating terms.
        System.out.println(repeat(arr,n));
    }
    static int repeat(int[] arr, int n){
        int add=0;
        for(int i:arr){
            add=add+i;
        }
        if((add%n)==0){
            return n;
        }
        return (add%n);
    }
}

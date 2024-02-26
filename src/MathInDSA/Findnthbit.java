package MathInDSA;

public class Findnthbit {
    public static void main(String[] args) {
        int n=126;
        int k=5;
        System.out.println(bit(n,k));
    }

    static int bit(int n,int k) {
        int a=1;
        a<<=(k-1);
        n &=a;
        return n;
    }
}

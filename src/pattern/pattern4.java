package pattern;

public class pattern4 {
    public static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=2;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

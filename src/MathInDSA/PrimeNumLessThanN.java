public class PrimeNumLessThanN {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 2; i <= n; i++) {
            check(i);
        }

    }

    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    static void check(int n) {
        if (isprime(n) == true) System.out.println("The given Number "+n+" is prime");
    }
}
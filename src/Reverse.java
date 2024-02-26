public class Reverse {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(reverseNegativeInteger(x));

    }

//    static int reverse(int x) {//In case of negative indices.
//        if (x < 0) {
//            return (int) -reverseNegativeInteger(-x);
//        } else {
//            return (int) reverseNegativeInteger(x);
//        }
//    }

    static int reverseNegativeInteger(int x) {
        int count = 0;
        while (x > 0) {
            int rem = x % 10;
            count = count * 10 + rem;
            x = x / 10;
        }
        return count;
    }
}
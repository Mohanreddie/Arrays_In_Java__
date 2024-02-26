public class TechM {
    public static void main(String[] args) {
        int initial=4;
        int energy=3;
        int k=5;
        int i=0;
        while (i<k-1){
            initial=initial+energy;
            i++;
        }
        System.out.println(initial);

    }
}
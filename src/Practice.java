public class Practice {
    public static void main(String[] args) {
        String ans="abcdcba";
        System.out.println(ispalindrome(ans));
    }
    static boolean ispalindrome(String str){
        if(str.length()==0){
            return true;
        }
        str=str.toLowerCase();
        for(int i=0;i<=str.length()/2;i++){
            char start=str.charAt(i);
            char last=str.charAt(str.length()-i-1);
            if(start!=last){
                return false;
            }
        }
        return true;
    }
}

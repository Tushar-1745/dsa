public class palindromenumber {
    public static void main(String[] args) {
        int x=-121;
        boolean ans= isPalindrome(x);
        System.out.println(ans);
    }
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);

        int i=0;
        int j=str.length()-1;

        while(i<j){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);

            if(ch1!=ch2){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}

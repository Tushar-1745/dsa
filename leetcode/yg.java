public class yg {
    public static void main(String[] args) {
        String s1 = "tu";
        String s2 = "ymadane";
        String out = "tyumadane";
        int max=0;
        if(s1.length()>s2.length()){
            max=s1.length();
        }
        else{
            max=s2.length();
        }

        String ans =" ";
        for(int i=0;i<max;i++){
            if(i<s1.length()){
                char ch = s1.charAt(i);
                ans += ch;
                
            }
            if(i<s2.length()){
                char ch2 = s2.charAt(i);
                ans += ch2;
            }
            
            
        }

        System.out.println(ans);
    }
}

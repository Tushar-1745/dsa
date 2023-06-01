public class issbu {
    public static void main(String[] args) {
        String str1 = "abc";
        String[] str = {"agc", "agd","agdc","ab","abc","abd","abdc", "abg"};

        for(String val: str){
            if(val.equals(str1)){
                System.out.println(val);
                System.out.println(true);
            }
        }
    }
}

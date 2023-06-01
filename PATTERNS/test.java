public class test {
    public static void main(String[] args) {
        int n=5;
        int val=1;
        for(int i=1;i<n*2;i++){
            for(int j=1;j<n*2;j++){
                if(i==j||i+j==n*2){
                    System.out.print(val);
                }
                else{
                    System.out.print(" ");
                }
            }
            if(i<n){
                val++;
            }
            else{
                val--;
            }
            System.out.println();
        }
    }
}

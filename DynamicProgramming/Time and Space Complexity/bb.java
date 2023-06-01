public class bb {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 2, 1, 1, 2, 0, 2, 2, 1, 0, 1, 2, 1, 2, 0};
        sort01(arr);
        print(arr);
        
    }
    public static void sort01(int[] arr){
        int i=0;
        int j=0;
        int k=arr.length-1;
        while(i<=k){
            if(arr[i]==0){
                swap(arr, i, j);
                i++;
                j++;
            }
            else if(arr[i]==2){
                swap(arr, i, k);
                k--;
            }
            else{
                i++;
            }
        }
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

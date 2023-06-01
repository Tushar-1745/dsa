public class pr{
    public static void main(String[] args) {
        int[] arr = {15, 11, 4, 4, 4, 9};
        int x=4;

        // int iarr = allindices(0, arr);
        int ans = allindices(0, arr, x);
        System.out.println(ans);

        // if(iarr.length==0){
        //     System.out.println();
        //     return;
        // }

        // for(int i=0;i<iarr.length;i++){
        //     System.out.println(iarr[i]);
        // }
    }
    public static int allindices(int idx, int[] arr, int tar){
       if(idx==arr.length){
        return -1;
       }

       int ans = allindices(idx+1, arr, tar);
       if(ans==-1){
        if(arr[idx]==tar){
            return idx;
        }
        else{
            return -1;
        }
       }else{
        return ans;
       }
        
    }
}
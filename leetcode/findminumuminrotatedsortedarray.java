public class findminumuminrotatedsortedarray {
    public static void main(String[] args) {
        int[] array = {3,4,5,1,2};
        int ans=minumuminrotatedsortedarray(array);
        System.out.println(ans);

    }
    public static int minumuminrotatedsortedarray(int[] array){
        int low=0;
        int high=array.length-1;

        while(low<high){
            int mid=(low+high)/2;

            if(array[mid]>array[high]){
                low=mid+1;
            }
            else if(array[mid]<array[high]){
                high=mid;
            }
        }
        return array[high];
    }
}

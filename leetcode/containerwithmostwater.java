public class containerwithmostwater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        // Output: 49

        int l=0;
        int r=height.length-1;
        int max=0;

        while(l<r){
            int lh = height[l];
            int rh = height[r];

            int min_height = Math.min(lh, rh);
            max = Math.max(max, min_height*(r-l));
            
            if(lh<rh){
                l++;
            }
            else{
                r--;
            }
        }
        System.out.println(max);
    }
}

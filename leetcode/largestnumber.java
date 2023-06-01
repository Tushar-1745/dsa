import java.util.Arrays;

import javax.lang.model.element.AnnotationValueVisitor;

public class largestnumber {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        largestno(nums);
     
    }
    public static void largestno(int[] nums){
        
        String[] s = new String[nums.length];

        for(int i=0;i<nums.length;i++){
            s[i]=String.valueOf(nums[i]);
        }

        Arrays.sort(s, (a,b)->(b+a).compareTo(a+b));

        StringBuilder sb = new StringBuilder();
        for(String str: s){
            sb.append(str);
        }

        String result = sb.toString();
        System.out.println(result);
    }
}

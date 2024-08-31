package Array;

import java.util.Arrays;

public class move_zeroes {
    static void moveZeroes(int[] nums) {
        int i=0;
        int count=0;
        
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=0)
            {
                nums[i]=nums[j];
                i++;
            }
            else if(nums[j]==0)
            {
              count++;
            }
        }
        for(int j=0;j<count; j++)
        {
            System.out.print(i);
            nums[i]=0;
            i++;
        }
        System.out.print(Arrays.toString(nums));

        
        
    
    }
    public static void main(String[] args) {
        int[] nums={1,0,3,12};
        moveZeroes(nums);
    }
    
}

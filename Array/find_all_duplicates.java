//442. Find All Duplicates in an Array
//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/



package sorting.cycle_sort;

import java.util.ArrayList;
import java.util.List;

public class find_all_duplicates {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(duplicate(nums));
        
    }
    static List<Integer> duplicate(int[] nums)
    {
        List<Integer> result =new ArrayList<>();
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;                 //if range is from 1 to n
            //int correct=nums[i];                   //if range is from 0 to n
            if( nums[i]!=nums[correct])
            {
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            
        else{
            i++;
        }
        }
        for(int j=0; j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                result.add(nums[j]);
            }
        }
        return result;
    }

    
}

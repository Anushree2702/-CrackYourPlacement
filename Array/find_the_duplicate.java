//287. Find the Duplicate Number
//https://leetcode.com/problems/find-the-duplicate-number/description/

package sorting.cycle_sort;

public class find_the_duplicate
{
    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        System.out.println(duplicate(nums));
        
    }

    /* 
    
    public int findDuplicate(int[] nums) {
      
        int i=0;
        while(i<nums.length)
        {  
           
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
           
        else
        {
            i++;
        }
        }
        for(int j=0; j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                return nums[j];
               
            }
        }
        return -1;
        }
    */


    //DIRECT METHOD
    static int duplicate(int[] nums)
    {
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]!=i+1)
            {
            int correct=nums[i]-1;                 //if range is from 1 to n
            //int correct=nums[i];                   //if range is from 0 to n
            if( nums[i]!=nums[correct])
            {
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{                                  //if element already present at its correct position then return that element(its duplicate)
                return nums[i];
            }
        }
        else{
            i++;
        }
        }
        return -1;
    }

}
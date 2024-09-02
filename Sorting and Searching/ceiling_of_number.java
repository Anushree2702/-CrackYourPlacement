package searching.Binary_Search;

public class ceiling_of_number {
    static int ceiling(int[] nums , int target)
    {
        
       
            int start=0;
            int end=nums.length-1;
            if(target>nums[end])
            {
                return -1;
            }
            while(start<=end)
            {
            int mid=(start)+(end-start)/2;
            if(target==nums[mid])
            {
                return mid;
            }
    
            if(target<nums[mid])
            {
                end=mid-1;
            }
            if(target>nums[mid])
            {
                start=mid+1;
            }
            }
            return start;
    
            
        
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,5,7,88,555};
        int target=99;
        System.out.println(ceiling(nums, target));
        
    }
    
    
}

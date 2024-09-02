package searching.Binary_Search;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class peak_index_in_mountain_array {
    static  int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while ((start<end)) {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                //you are in desc part of array  
                //this may be the ans but look at the left
                //this is why mid!=end-1
                end=mid;
            }
            else
            {
                //you are in asec part of array
                //this is not the answer so look at the right
                //this is why start=mid+1
                start=mid+1;
            }
            
        }
        //int the end , start==end  and pointing to the largest number because of the 2 checks above 
        return start;
    }
    
}

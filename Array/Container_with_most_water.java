package Array;

public class Container_with_most_water {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    static int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int ans=0;
        while(start<end)
        {
            if(height[start]<height[end])
            {
                int a=height[start]*(end-start);
                start++;
            
                if(ans<a)
                {
                    ans=a;
                }
            }
            else{
                int b=height[end]*(end-start);
                
                end--;
                if(ans<b)
                {
                    ans=b;
                }
            }
        }
        return ans;

        
    }

    
}

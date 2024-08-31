package Array;

public class remove_duplicates {
    static int removeduplicates(int[] arr)
    {
        int i=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[i]!=arr[j])
            {
                arr[i+1]=arr[j];
                i++;
            }
            
        }
        return i+1;
    } 
    public static void main(String[] args) {

        int[] arr={1,1,2,2,2,3,3};
        System.out.println(removeduplicates(arr));


        
        
    }
  
    
}

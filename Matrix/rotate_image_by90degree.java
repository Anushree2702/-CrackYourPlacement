package Array;

import java.util.Arrays;

public class rotate_image_by90degree {
    static void swap(int[][] matrix , int row1 , int col1 , int row2 , int col2)
    {
        int temp=matrix[row1][col1];
        matrix[row1][col1]=matrix[row2][col2];
        matrix[row2][col2]=temp;
    }
    static void transpose(int[][] matrix )
    {
        int n=matrix.length;
        for(int i=0 ; i<n ; i++)
        {
            for(int j=i ; j< n ; j++)
            {
                swap(matrix, i,j,j,i);
            }
        }
    }
    static void reverse(int[][] matrix)
    {
        int n=matrix.length;
        for(int i=0; i<n ;  i++)
        {
        int start=0;
        int end=n-1;
        while(start<end)
        {
            swap(matrix, i , start , i , end);
            start++;
            end--;

        }
    }
   
    }
    static void display(int[][] matrix)
    {
        int n=matrix.length;
        for(int[] i :matrix)
        {
           
                System.out.println(Arrays.toString(i));
            }
            System.out.println();
        
    }
    public static void main(String[] args) {
        {
            int[][] matrix={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
            transpose(matrix);
            reverse(matrix);
            display(matrix);
        }
    }
    
}

package Array;

import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiral(matrix));
    }
    static List<Integer> spiral(int[][] matrix )
    {
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        List<Integer> result= new ArrayList<>();
        int direction=0;
        while(top<=bottom && left<=right)
        {
            if(direction==0)
            {
                for(int i=left ; i<=right ; i++)
                {
                    result.add(matrix[top][i]);
                }
                top++;
            }
            if(direction==1)
            {
                for(int i=top ; i<=bottom ; i++)
                {
                    result.add(matrix[i][right]);
                }
                right--;
            }
            if(direction==2)
            {
                for(int i=right ; i>=left ; i--)
                {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(direction==3)
            {
                for(int i=bottom ; i>=top ; i--)
                {
                    result.add(matrix[i][left]);
                }
                left++;
            }
            direction=(direction+1)%4;
        }
        return result;
    }
    
}

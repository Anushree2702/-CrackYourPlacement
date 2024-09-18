package Strings;

/*Given a string s, return true if the s can be palindrome after deleting at most one character from it.

 Example 1:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.


Example 3:

Input: s = "abc"
Output: false
 */

public class Valid_palindrome_ll {
    public static void main(String[] args) {
        String s="abca";
        String b="abc";
        System.out.println(validpalindrome(s));
        System.out.println(validpalindrome(b));

        
    }
    static boolean validpalindrome(String s)
    {
        int start=0;
        int end=s.length()-1;
        while(start<=end)
        {
        if(s.charAt(start)==s.charAt(end))
        {
            start++;
            end--;
        }
        else{
            return ispalindrome(s, start+1, end) || ispalindrome(s, start, end-1);
            
        }
      
    }
    return true;

        
        

    }
    static boolean ispalindrome(String s , int start, int end)
    {
        while(start<=end)
        {
        if(s.charAt(start)==s.charAt(end))
        {
            start++;
            end--;
        }
        else{
            return false;
        }
    }
        return true;
    }

    
}

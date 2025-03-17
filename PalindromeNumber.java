//Leetode question 9 - https://leetcode.com/problems/palindrome-number/description/

class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) 
        return false;
        int q = x;
        int result =q%10;
         int remainder = q%10;
         q=q/10;
        while(q!=0){
            remainder = q%10;
             result = result* 10 + remainder ;  
            q = q/10;
           
        }
        return result == x;
    }
}

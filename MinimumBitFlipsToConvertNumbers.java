// Question number 2220 - https://leetcode.com/problems/minimum-bit-flips-to-convert-number/ in leetcode
class Solution {
    public int minBitFlips(int start, int goal) {
        /*Need to find out the bits which are different in A and B
        // Mpst propbably need to use xor operator since if two bits are different then it will
        // result to 1 or else 0
        Post xor we will retrieve a number in which number of 1 bits will give us the actual 
        answer. Since we have done xor , the number of bits which are 1 will be the bits which
        are different in both the numbers.
        Now in order to find number of 1 bits in any number just do n & n-1 , till the time , 
        the number becomes 0 .
        The no of iterations will give us the number of 1 bits present in the number
        */

        int xor = start ^ goal;
        
        int count =0;
        while(xor!=0){
            xor = (xor) & (xor-1);
            count++;

        }
        return count;
    }
}

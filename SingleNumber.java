// Question Number 136 - https://leetcode.com/problems/single-number/description/

class Solution {

/* Need to use the properties of xor
    n^n =0 and 0 ^n =n
    xor every number with one another in a sequential manner
    ex array - [2,2,1]
    Result = 2^2^1 = 0^1 = 1
*/

    public int singleNumber(int[] nums) {
        int result =0;
        for(int num:nums)
            result = result ^ num;

        return result;
    }

}

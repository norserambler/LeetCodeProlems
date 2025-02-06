class Solution {
/*
LeetCode question 260 - https://leetcode.com/problems/single-number-iii/

Xor every element of the array and we will be left with a^b where the a & b will be the elements that needs to be retrieved
Grouping of the elements needs to be done in a certain way that one half of the array contains the number a and the other half contains number b.
Once grouping is done , we can xor the result of a ^ b with each element of the group and will be left with 2 elements in 2 groups that is the answer

Grouping needs to be done on the basis of the right most significant bit position - (a^b) & -(a^b) = tempResult

Use and operator tempResult with every element of the array to find out the set bit. 
if the result ==0 put them in one group and xor every element of the group 1 with a^b
if the result is not 0 , put them in different group and xor every element of the group 2 with a^b

*/



    public int[] singleNumber(int[] nums) {
        int xorResult = 0;
        for(int i:nums){
            xorResult = xorResult ^ i; // using xor sequentially on every element to finally get a ^ b
        }
        int tempResult = xorResult & (-xorResult); // checking the position of the rightmost set bit
         int[] rets = new int[2];
        Arrays.fill(rets, 0);
        for(int i:nums){
            if((i & tempResult) ==0){ // grouping 1 
                rets[0] = rets[0] ^ i;
            }
            else                       // grouping 2 
                rets[1] = rets[1] ^i;
        }
        return rets;
    }
}

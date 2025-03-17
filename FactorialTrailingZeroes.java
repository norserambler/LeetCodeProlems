// LeetCOde QUestion 172 - https://leetcode.com/problems/factorial-trailing-zeroes/description/


class Solution {
    public int trailingZeroes(int n) {
        // need to find the number of 10 that gets multiplied in the factorial in order to get trailing zeros
        // no of 2 will always be more than number of 5 and hence , we need to find the number of 5 that will get multiplied => n/5
        //now in 30! no of 5 that will get multiplied is not 30/5 since 25 has 2 fives.
        // Hence need to update the formula to n/5 + n/25 + n/ 125 + ........

        int res =0;
        for(int i=5 ; i<=n ; i=i*5){
            res = res + n/i;
        }
        return res;
    }
}

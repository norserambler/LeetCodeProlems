class Solution {
    public int findGCD(int[] nums) {
        int min =nums[0];
        int max =nums[0];
        for(int i : nums){
            if(i > max)
                max =i;
            if(i<min)
                min =i;
        }

        return gcd (min,max);
    }
    public int gcd(int a,int b){
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
}

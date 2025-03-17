//Leetcode question 204 - https://leetcode.com/problems/count-primes/description/

class Solution {
    public int countPrimes(int n) {
        // need to use sieve of eratosthenes
        // create an array of n + 1 and and mark every position as true
        // make 0 and 1 as false since they will not be counted
        // make multiples of 2 as true then 3 as true , then 4 as true till square root of n
        // the number of trues in the array will be the no of primes in the range
        //   0 1 2 3 4 5 6 7 8 9 10 11 12
        //2->F F T T F T F T F T F  T  F
        //3->F F T T F T F T F F F  T  F
        // SQUARE ROOT OF 12 = 3.. ~ 3 , hence need to run the iteration till 23
    if(n==0 || n==1 || n==2)
    return 0;
    if(n==3)
    return 1;
    
        boolean isPrime[] = new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i= 2 ;i*i <n ; i++){
            for(int j=2*i ; j<n ; j = j+i){
                // getting the next multiple of every number hence multiplying with 2 
                isPrime[j] = false;
            }
        }
        int count =0;
        for(boolean b : isPrime){
            if(b==true)
            count++;
        }
        return count;
        
    }
}

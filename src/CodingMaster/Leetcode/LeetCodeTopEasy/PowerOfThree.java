package CodingMaster.Leetcode.LeetCodeTopEasy;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n<1){
            return false;
        }
        while(n%3==0){
            n=n/3;
        }
        return n==1;
    }
}

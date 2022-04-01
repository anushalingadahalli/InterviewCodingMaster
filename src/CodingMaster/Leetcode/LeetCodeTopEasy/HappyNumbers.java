package CodingMaster.Leetcode.LeetCodeTopEasy;

import java.util.HashSet;

public class HappyNumbers {
    public boolean isHappy(int n) {
        HashSet<Integer>set=new HashSet<>();
        while(n!=1){
            int temp=n;
            int sum=0;
            while(temp>0){
                int digit= temp % 10;
                sum+=digit * digit;
                temp/=10;
            }
            n=sum;
            if(set.contains(n)){
                return false;
            }
            else{
                set.add(n);
            }
        }
        return true;
    }
}

package CodingMaster.Leetcode.LeetCodeTopEasy;

public class NumberOfBits {
    public int hammingWeight(int n) {
        int bits=0;
        int mask=1;
        for(int i=0;i<32;i++){
            if((n&mask)!=0)
            {bits++;}
           mask<<=1;
        }
        return  bits;
        //return Integer.bitCount(n);
    }
}

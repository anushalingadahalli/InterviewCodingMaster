package CodingMaster.Leetcode.PayPal;

public class HappyNumber {
    public boolean isHappy(int n){
        int slowRunner=n;
        int fastRunner = getNext(n);
        while(fastRunner!=1  && slowRunner!= fastRunner){
            slowRunner=getNext(n);
            fastRunner=getNext(getNext(fastRunner));
        }
        return fastRunner==1;
    }
    public int getNext(int n){
        int totalSum=0;
        while(n>0){
            int d=n%10;
            n=n/10;
            totalSum+=d * d ;
        }
        return totalSum;
    }
}

/* time complexity = O (log n )
 space complexity = O(1)
 */
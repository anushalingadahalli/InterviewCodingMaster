package CodingMaster.Leetcode.LeetCodeTopEasy;

public class MinBalloon {
    public int solution(String S) {
        // write your code in Java SE 8
        int b=0,a=0,l=0,o=0,n=0,min=0;
        for(char c : S.toCharArray())
        {
            if(c=='B') b++;
            if(c=='A') a++;
            if(c=='L') l++;
            if(c=='O') o++;
            if(c=='N') n++;
        }
        min=Math.min(Math.min(b,Math.min(a,l/2)),Math.min(o/2,n));
        return min;

    }
}

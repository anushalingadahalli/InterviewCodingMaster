package CodingMaster.Leetcode.Tesla;

public class MaxBalloons {
    public int maxNumberOfBalloons(String text) {
        int bCount=0,aCount=0,lCount=0,oCount=0,nCount=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)== 'b')
                bCount++;
            if (text.charAt(i)=='a')
                aCount++;
            if (text.charAt(i)=='l')
                lCount++;
            if (text.charAt(i)=='o')
                oCount++;
            if(text.charAt(i)=='n')
                nCount++;
        }
        lCount=lCount /2;
        oCount=oCount/2;

        return Math.min(bCount,Math.min(aCount,Math.min(lCount,Math.min(oCount,nCount))));
    }
}

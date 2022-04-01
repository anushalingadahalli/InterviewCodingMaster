package CodingMaster.Leetcode.LeetCodeTopEasy;

public class ShuffleDigits {
    public int solution(int A) {
        // write your code in Java SE 8
        String result="";
        if(A >=0 && A<=100000000)
        {
            String input=String.valueOf(A);
            char[] numchars=input.toCharArray();
            for(int i=0;i<numchars.length;i++){
                if(i%2==0){
                    result=result+numchars[i/2];
                }
                else{
                    result=result+numchars[numchars.length-(i/2+1)];
                }
            }
        }
        return Integer.valueOf(result);
    }
}

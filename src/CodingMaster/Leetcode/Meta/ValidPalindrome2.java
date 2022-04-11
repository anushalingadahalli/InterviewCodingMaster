package CodingMaster.Leetcode.Meta;

public class ValidPalindrome2 {
    public static void main(String[] args) {
        ValidPalindrome2 validPalindrome2=new ValidPalindrome2();
        boolean output1=validPalindrome2.validPalindrome("aba");
        boolean output2=validPalindrome2.validPalindrome("abca");
        boolean output3=validPalindrome2.validPalindrome( "abc");
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
    }

    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return checkPalindrome(s, i, j-1) || checkPalindrome(s,i+1,j);
            }
            i++;
            j--;
        }
        return true;

    }
    public boolean checkPalindrome(String s, int i , int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}


//Time complexity: O(N)
//Space complexity: O(1)
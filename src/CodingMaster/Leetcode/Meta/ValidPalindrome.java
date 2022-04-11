package CodingMaster.Leetcode.Meta;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome=new ValidPalindrome();
        boolean output1=validPalindrome.isPalindrome("A man, a plan, a canal: Panama");
        boolean output2=validPalindrome.isPalindrome("race a car");
        System.out.println(output1);
        System.out.println(output2);
    }

    public boolean isPalindrome(String s) {
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
        }
        return true;
    }
}
/*Time complexity : O(n), in length nn of the string.

Space complexity : O(1). No extra space required, at all.*/
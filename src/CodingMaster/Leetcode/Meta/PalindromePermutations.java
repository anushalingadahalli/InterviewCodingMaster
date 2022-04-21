package CodingMaster.Leetcode.Meta;

import java.util.HashMap;

public class PalindromePermutations {
    public static void main(String[] args) {
       PalindromePermutations palindromePermutations=new PalindromePermutations();
        boolean output1=palindromePermutations.canPermutePalindrome("code");
        boolean output2=palindromePermutations.canPermutePalindrome("aab");
        System.out.println(output1);
        System.out.println(output2);
    }

    public boolean canPermutePalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char key : map.keySet()){
            count+=map.get(key)%2;
        }
        return count<=1;
    }
}
/*Time complexity : O(n)
Space complexity : O(1)
 */
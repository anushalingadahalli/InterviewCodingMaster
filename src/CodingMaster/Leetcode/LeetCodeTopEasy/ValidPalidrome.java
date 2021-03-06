package CodingMaster.Leetcode.LeetCodeTopEasy;/*
Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.



        Example 1:

        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.
        Example 2:

        Input: s = "race a car"
        Output: false
        Explanation: "raceacar" is not a palindrome.
*/


public class ValidPalidrome {
    public boolean isPalindrome(String s) {

        int left=0;
        int right=s.length()-1;
        while(left < right) {
            while(!Character.isLetterOrDigit(s.charAt(left)) && left < right) {
                left++;
            }

            while(!Character.isLetterOrDigit(s.charAt(right)) && right > left) {
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;

    }
}

package CodingMaster.Leetcode.GoldmanSachs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWordsString {
    public String reverseWords(String s) {
        System.out.println("Input is" +s);
        String[] words = s.split(" ");   //step 1
        List<String> wordList = Arrays.asList(words);
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
    public String getReversedWordsDots(String t){
        System.out.println("Input is" +t);
        String[] words=t.split("\\.");
        List<String>wordList=Arrays.asList(words);
        Collections.reverse(wordList);
        return String.join(".",wordList);
    }
    //Function to reverse words in a given string.
    public String getReversedWords(String S)
    {
        // code here
        // Time Complexity - O(N)
        // Space Complexity - O(1)
        char[] chars = S.toCharArray();

        int left = 0, right = 0;
        for (int i = 0; i < chars.length; i++) {
            // reverse a word
            if (chars[i] == '.') {
                reverse(chars, left, right);

                left = right = i + 1;
            }
            else
                right = i;
        }

        reverse(chars, left, right);

        // again reverse to get the correct output
        reverse(chars, 0, chars.length - 1);

        return new String(chars);
    }

    static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    static void reverse(char[] chars, int left, int right) {
        while (left < right) {
            swap(chars, left, right);
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input String with space:");
        String input1=sc.nextLine();
        System.out.println("Enter input String with dots:");
        String input2=sc.nextLine();
        ReverseWordsString reverseWordsString=new ReverseWordsString();
        String output1=reverseWordsString.reverseWords(input1);
        String output2=reverseWordsString.getReversedWordsDots(input2);
        String output3=reverseWordsString.getReversedWords(input2);
        System.out.println("Reversing words in string with space:" +output1);
        System.out.println("Reversing words in string with dots:" +output2);
        System.out.println("Reversing words in string with dots in method2:" +output3);
    }
}

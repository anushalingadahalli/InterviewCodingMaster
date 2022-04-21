package CodingMaster.CrackingCodingInterview.Arrays;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class PalindromePermutations {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input String: ");
        String input=sc.nextLine();
        PalindromePermutations palindromePermutations=new PalindromePermutations();
        boolean check=palindromePermutations.getPermutePalindrome(input);
        System.out.println("Can the permutation of the input string form palindrome?"   +check);

    }
    public boolean getPermutePalindrome(String s){
        s=s.toLowerCase();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        for(char key : map.keySet()){
            count+=map.get(key)%2;
        }
        return count<=1;
    }
}
/* Time complexity = O(n)
Space Complexity = O(1)*/
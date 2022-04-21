package CodingMaster.CrackingCodingInterview.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CheckStringPermutation {
    public boolean checkPermutation(String input1,String input2){
        if(input2.length()<=input1.length()){
            return false;
        }
        return sortString(input1).equals(sortString(input2));
    }
    public String sortString(String s){
        char [] chars=s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first input string: " );
        String input1=sc.next();
        System.out.println("Enter the second input string: " );
        String input2=sc.next();
        CheckStringPermutation cp=new CheckStringPermutation();
        boolean checkPermutations=cp.checkPermutation(input1,input2);
        System.out.println("Is input1 string permutation of input2 string?:" +checkPermutations);
    }
}

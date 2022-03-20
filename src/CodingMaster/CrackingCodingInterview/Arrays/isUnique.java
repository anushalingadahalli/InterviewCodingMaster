package CodingMaster.CrackingCodingInterview.Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class isUnique {
    public isUnique(){

    }
    /* using set data structure*/
    public boolean isUnique(String input){

        Set<Character> set=new HashSet<>();
        for(int i=0;i<input.length();i++){
            if(set.contains(input.charAt(i))){

                return false;
            }
            else{
                set.add(input.charAt(i));
            }
        }
        return true;
    }

    /*not using additional data structure */
    public boolean isUniqChar(String input){
        if(input.length()>128) return  false;
        boolean [] getUniq=new boolean[128];
        for(int i=0;i<input.length();i++){
            //char c=input.charAt(i);
            //System.out.println("char is: " +c);
            int val=input.charAt(i);
           // System.out.println("val is: " +val);
            if(getUniq[val]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input String:");

        String input =sc.nextLine();
        isUnique getUnique=new isUnique();
        boolean isUnique=getUnique.isUnique(input);
        System.out.println("The input string has unique characters ?:" +isUnique);
        boolean isUniqChar=getUnique.isUniqChar(input);
        System.out.println("The input string has unique characters ?:" +isUnique);

    }
}

//time - O(n) space - O(1)
package CodingMaster.Leetcode.GoldmanSachs;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        if(s==null || t==null){
            return false;
        }
        if(s== null && t==null){
            return true;
        }
        char [] schar =s.toCharArray();
        char [] tchar=t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        return Arrays.equals(schar,tchar);
    }

    public boolean isAnagramString(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] counter=new int[26];
        for(int i=0;i<s.length();i++){
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i)- 'a']--;
        }
        for(int count : counter){
            if(count!=0) {
                return false;
            }
        }
        return true;
    }
}

package CodingMaster.Leetcode.LeetCodeTopEasy;

import java.util.List;

public class MaxUniqueCharConcatString {
    public int maxLength(List<String> arr) {
        int[] result=new int[1];
        maxUniqueChar(arr,0,"",result);
        return result[0];
    }
    public void maxUniqueChar(List<String>arr,int index,String current,int[] result){
        if(index==arr.size() && uniqCharCount(current)>result[0]){
            result[0]=current.length();
            return;
        }
        if(index==arr.size()){
            return;
        }
        maxUniqueChar(arr,index+1,current,result);
        maxUniqueChar(arr,index+1,current+arr.get(index),result);
    }
    public int uniqCharCount(String s){
        int[] alpha=new int[26];
        for(char c : s.toCharArray()){
            if(alpha[c-'a']++>0) {
                return -1;
            }
        }
        return s.length();
    }
}

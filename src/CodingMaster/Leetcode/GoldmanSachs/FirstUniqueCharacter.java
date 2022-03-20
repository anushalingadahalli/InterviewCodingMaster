package CodingMaster.Leetcode.GoldmanSachs;

import java.util.HashMap;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> count=new HashMap<>();
        int len=s.length();
        for(int i=0;i<len;i++){
            char c =s.charAt(i);
            count.put(c,count.getOrDefault(c,0)+1);
        }
        for(int i=0;i<len;i++){
            if(count.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}

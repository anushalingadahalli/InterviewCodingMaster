package CodingMaster.Leetcode.LeetCodeTopEasy;

import java.util.HashMap;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,map.get(c));
            }
        }
            for(int i=0;i<s.length();i++){
                if(map.get(s.charAt(i))==1)
                    return 1;
            }
            return -1;

    }
}

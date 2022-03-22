package CodingMaster.Leetcode.GoldmanSachs;

import java.util.HashSet;
import java.util.Set;

public class SentencePanagram {
    public boolean checkIfPangram(String sentence) {
        char[] str = sentence.toCharArray();
        // System.out.println(Arrays.toString(str));
        Set<Character> s = new HashSet<>();

        for(char i : str){
            s.add(i);
        }
        if(s.size() == 26){
            return true;
        }
        return false;
    }
}

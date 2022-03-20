package CodingMaster.Leetcode.LinkedIn;

import java.util.ArrayList;
import java.util.HashMap;

public class ShortWordDistance2 {
    HashMap<String, ArrayList<Integer>>map;
    public ShortWordDistance2(String[] wordsDict) {
        this.map=new HashMap<String,ArrayList<Integer>>();
        for(int i=0;i<wordsDict.length;i++){
            ArrayList<Integer>loc=this.map.getOrDefault(wordsDict[i],new ArrayList<Integer>());
            loc.add(i);
            this.map.put(wordsDict[i],loc);
        }

    }

    public int shortest(String word1, String word2) {
        ArrayList<Integer>locations1=new ArrayList<>();
        ArrayList<Integer>locations2=new ArrayList<>();
        int l1=0,l2=0,minDiff=Integer.MAX_VALUE;
        locations1=this.map.get(word1);
        locations2=this.map.get(word2);
        while(l1<locations1.size() && l2<locations2.size()){
            minDiff=Math.min(minDiff,Math.abs(locations1.get(l1)-locations2.get(l2)));
            if(locations1.get(l1)<locations2.get(l2)){
                l1++;
            }
            else{
                l2++;
            }
        }
        return minDiff;
    }
}

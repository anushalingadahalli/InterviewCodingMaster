package CodingMaster.Leetcode.GoldmanSachs;

import java.util.Arrays;

public class LargestNumberFormed {
    String printLargest(String[] arr) {
        // code here
        Arrays.sort(arr,(a, b)->{
            String x=a+b,y=b+a;
            return y.compareTo(x);
        });
        StringBuilder sb=new StringBuilder();
        for(String s:arr)
            sb.append(s);
        return sb.toString();
    }
}

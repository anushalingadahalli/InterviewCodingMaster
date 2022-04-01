/*
Implement a method to perform basic string compression using the counts
* of repeated characters. For example, the string aabcccccaaa would become
* a2b1c5a3. If the "compressed" string would not become smaller than the
* original string, your method should return the original string.
 */


package CodingMaster.CrackingCodingInterview.Arrays;

public class StringCompressions {
    public static String compress(String str) {
        if (str.length() <= 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 1);
        char currChar = str.charAt(0);
        int currCount = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currChar) {
                currCount++;
            } else {
                sb.append(currChar);
                sb.append(currCount);
                if(sb.length() > str.length()) {
                    return str;
                }
                currChar = str.charAt(i);
                currCount = 1;
            }
        }
       sb.append(currChar);
       sb.append(currCount);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("aabcccccAAAZZZPPPP"));
    }
}

package CodingMaster.Leetcode.GoldmanSachs;

public class RotateString {
    public boolean rotateString(String first, String second){
        if (first.length() != second.length()) {
            return false;
        }

        String concatenated = first + first;

        if (concatenated.indexOf(second) != -1) {
            return true;
        }

        return false;
    }
}

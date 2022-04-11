package CodingMaster.Leetcode.Meta;

public class RemoveAdjDuplicates {
    public static void main(String[] args) {
        RemoveAdjDuplicates removeAdjDuplicates=new RemoveAdjDuplicates();
        String output1=removeAdjDuplicates.removeDuplicates("abbaca");
        String output2=removeAdjDuplicates.removeDuplicates("azxxzy");
        System.out.println(output1);
        System.out.println(output2);
    }

    public String removeDuplicates(String s){
        StringBuilder removeDups=new StringBuilder();
        for(char c : s.toCharArray()){
            int n=removeDups.length();
            if(n >0 && removeDups.charAt(n-1)==c){
                removeDups.deleteCharAt(n-1);
            }
            else{
                removeDups.append(c);
            }
        }
        return removeDups.toString();
    }
}

/*Time: O(n)
Space: O(n)*/
package CodingMaster.Leetcode.GoldmanSachs;

public class CountNumTeams {
    public int numTeams(int[] rating) {
        int res = 0;
        for(int j=0;j<rating.length;j++){
            int small_left=0,big_left=0,small_right=0,big_right=0;
            for(int i=j-1;i>=0;i--){
                if(rating[i]<rating[j]){
                    small_left++;
                }
                else{
                    big_left++;
                }
            }
            for(int k=j+1;k<rating.length;k++){
                if(rating[k]>rating[j]){
                    big_right++;
                }
                else{
                    small_right++;
                }
            }
            res+= small_left*big_right + big_left*small_right;
        }
        return res;

    }
}

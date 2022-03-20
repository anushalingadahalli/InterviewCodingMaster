package CodingMaster.Leetcode.LinkedIn;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        boolean leftPlot =false ,rightPlot=false;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                if(i==0 || flowerbed[i-1]==0){
                    leftPlot=true;
                }
                else{
                    leftPlot=false;
                }
                if(i==flowerbed.length-1 ||flowerbed[i+1]==0){
                    rightPlot=true;
                }
                else{
                    rightPlot=false;
                }
                if(leftPlot && rightPlot){
                    flowerbed[i]=1;
                    count++;
                }
            }
        }
        return count>=n;
    }
}

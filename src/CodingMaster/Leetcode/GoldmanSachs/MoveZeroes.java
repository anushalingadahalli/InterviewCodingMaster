package CodingMaster.Leetcode.GoldmanSachs;

public class MoveZeroes {
    public void moveZeroes(int[] arr){
        int n=arr.length;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
            {
                arr[index++]=arr[i];
            }
        }
        while(index<n)
        {
            arr[index++]=0;
        }
    }
}

package CodingMaster.Leetcode.LeetCodeTopEasy;

public class MinReversal {

        public int solution(int[] A) {
            // write your code in Java SE 8
            return getMinReversal(A);
        }
        public int reverse(int number){
            return number==0?1:0;
        }
        public int getReversal(int [] arr,int expected){
            int reversal=0;
            for(int i=0;i<arr.length;i++){
                if(expected!=arr[i]){
                    reversal++;
                }
                expected=reverse(expected);

            }
            return reversal;
        }
        public int getMinReversal(int [] arr){
            return Math.min(getReversal(arr,0),getReversal(arr,1));
        }

}

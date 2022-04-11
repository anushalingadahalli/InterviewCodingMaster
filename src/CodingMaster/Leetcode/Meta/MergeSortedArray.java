package CodingMaster.Leetcode.Meta;

public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray=new MergeSortedArray();
        int [] nums1 = new int[]{1,2,3,0,0,0};
        int [] nums2=new int[]{ 2,5,6};
        int [] output =mergeSortedArray.merge(nums1, 3, nums2, 3);
        for (int i = 0; i < output.length; i++)
            System.out.println("Element at index " + i + " : "+ output[i]);
    }

    public int[] merge(int[] nums1, int m, int[] nums2, int n){
        int p1=m-1;
        int p2=n-1;
        for(int p=m+n-1;p>=0;p--){
            if(p2<0){
                break;
            }
            if(p1>=0 && nums1[p1] > nums2[p2]){
                nums1[p]=nums1[p1--];
            }
            else{
                nums1[p]=nums2[p2--];
            }
        }
        return nums1;
    }
}
/*Time complexity: O(n+m).
Space complexity: O(1).
*/
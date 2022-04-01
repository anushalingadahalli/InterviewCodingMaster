package CodingMaster.Leetcode.LeetCodeTopEasy;

public class MergeSortedList {
    public ListNodes mergeTwoLists(ListNodes l1, ListNodes l2) {
        ListNodes dummy=new ListNodes(-1);
        ListNodes node = dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                dummy.next=l1;
                l1=l1.next;
            }
            else{
                dummy.next=l2;
                l2=l2.next;
            }
            dummy=dummy.next;
        }
        if(l1!=null){
            dummy.next=l1;
        }
        else{
            dummy.next=l2;
        }
        return node.next;
    }
}

package CodingMaster.Leetcode.LeetCodeTopEasy;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead=new ListNode(0);
        ListNode node1=l1;
        ListNode node2=l2;
        ListNode result=dummyHead;
        int carry=0,sum=0;
        while(node1!=null || node2!=null){
            int v1=0;
            int v2=0;
            if(node1!=null){
                v1= node1.val;
            }
            if(node2!=null){
                v2=node2.val;
            }
            sum=v1+v2+carry;
            carry=sum/10;
            result.next=new ListNode(sum%10);
            result=result.next;
            if(node1!=null){
               node1=node1.next;
            }
            if(node2!=null){
               node2=node2.next;
            }
        }
        if(carry>0){
            result.next=new ListNode(carry);
        }
        return dummyHead.next;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

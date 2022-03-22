package CodingMaster.Leetcode.GoldmanSachs;

public class RemoveDuplicatesSortedList {
    public class ListNode {
     int val;
     ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode deleteDuplicates(ListNode head){
        ListNode cur=head;
        while(cur!=null && cur.next!=null){
            if(cur.next.val==cur.next.val){
                cur.next=cur.next.next;
            }
            else{
                cur=cur.next;
            }
        }
        return head;
    }
}

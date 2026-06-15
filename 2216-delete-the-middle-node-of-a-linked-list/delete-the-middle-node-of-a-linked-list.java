/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return null;
        ListNode s=head,f=head,c=head;
        while(f!=null && f.next!=null)
        {
            f=f.next.next;
            c=s;
            s=s.next;
        }
        c.next=s.next;
        return head;
    }
}
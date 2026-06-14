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
    public int pairSum(ListNode head) {
        ListNode s=head,f=head;
        Stack<Integer> st=new Stack<>();
        while(f!=null && f.next!=null)
        {
            st.push(s.val);
            s=s.next;
            f=f.next.next;
        }
        int ms=0;
        while(s!=null)
        {
            int sum=s.val+st.pop();
            ms=Math.max(ms,sum);
            s=s.next;
        }
        return ms;
    }
}
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
/*class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {=head=null  return null;         ListNode curr = head;
       int num = k;
       while(num>0 &&  curr!=null){
           curr = curr.next;
           num--;  
       
         }   if(ListNpo)
    } //ode hahah is it gli itts not ur fumbathcing
}*/

//babisan
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
       if(head==null) return null;
        ListNode n= head;
        int s=0;
        while(s<k && n!=null)
        {
            s++;
            n=n.next;
        }         
        ListNode c=head;
        ListNode p=c;
        if(s<k) return head;
        while(c!=n)
        {
            ListNode r=c.next;
            c.next=p;
            p=c;
            c=r;
        }
        head.next=reverseKGroup(n,k);
        return p;
    }
}
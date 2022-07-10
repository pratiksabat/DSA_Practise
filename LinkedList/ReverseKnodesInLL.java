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
    public ListNode reverseKGroup(ListNode head, int k) {
     if(head==null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev = dummy;
        ListNode curr=dummy;
        ListNode next=dummy;
        int c=0;
        while(curr.next!=null){
            curr=curr.next;
            c++;
        }
        while(c>=k){
           //initialisation
            curr=prev.next;
            next=curr.next;
            
            for(int i=1;i<k;i++){
               curr.next=next.next;
               next.next=prev.next;
               prev.next=next;
               next=curr.next;
            }
            
            prev=curr;
            c-=k;
        }        
        return dummy.next;
    }
}
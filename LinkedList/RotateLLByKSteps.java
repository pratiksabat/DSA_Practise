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
    public ListNode rotateRight(ListNode head, int k) {
       if(head==null||head.next==null||k==0) return head;
        
        //count length of LL
        ListNode t=head;
        int c=1;
        while(t.next!=null){
            c++;
            t=t.next;
        }
        
        // point last node to head
        t.next=head;
        // There can be 2 cases(k> length of LL or K< length of LL)
        // In order to cater > wala condition
        // Idea:- if len is 5, and k is multiple of 5, that means after rotatting k no of times we will get the same LL
        // To save these extra turns we do k=k%c
        // Next think, finally we just have to move the kth node to null and that node's next to head
        k=k%c;
        k=c-k;
        
        while(k-->0) t=t.next;
        
        head=t.next;
        t.next=null;
        
        return head;
        
    }
}
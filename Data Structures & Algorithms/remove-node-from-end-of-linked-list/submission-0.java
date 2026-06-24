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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int p= getSize(head)-n;
        if(p==0) return head.next;
        ListNode curr= head;
        for(int i=1;i<p;i++){
            curr= curr.next;
        }
        curr.next= curr.next.next;
        return head;
    }
    public int getSize(ListNode temp){
        int c=0;
        while(temp!=null){
            c++;
            temp= temp.next;
        }
        return c;
    }
}

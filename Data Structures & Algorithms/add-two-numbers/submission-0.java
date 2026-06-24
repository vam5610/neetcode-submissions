/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy node helps us build the result list easily
        ListNode dummy = new ListNode(0);

        // This pointer moves while creating the answer
        ListNode current = dummy;

        int carry = 0;

        // Continue until both lists and carry are finished
        while (l1 != null || l2 != null || carry != 0) {

            int value1 = (l1 != null) ? l1.val : 0;
            int value2 = (l2 != null) ? l2.val : 0;

            int sum = value1 + value2 + carry;

            // Current digit for result
            int digit = sum % 10;

            // Carry for next addition
            carry = sum / 10;

            current.next = new ListNode(digit);
            current = current.next;

            // Move pointers only if they exist
            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return dummy.next;
    }
}
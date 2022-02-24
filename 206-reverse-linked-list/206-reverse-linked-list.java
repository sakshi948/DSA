/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
   ListNode prev = null;
    while (head != null) {
        ListNode n = head.next;
        head.next = prev;
        prev = head;
        head = n;
    }
    return prev;
 
 */
class Solution {
    public ListNode reverseList(ListNode head) {
   
        ListNode prev = null;
        ListNode curr=head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr=temp;
          }
    
       return prev;
    
    }
}
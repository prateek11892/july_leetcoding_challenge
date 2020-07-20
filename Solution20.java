// Remove Linked List Elements

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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        ListNode ptr = dummy;
        dummy.next = head;
        while(ptr != null){
            while(ptr.next != null && ptr.next.val == val){
                ptr.next = ptr.next.next;
            }
            ptr = ptr.next;
        }
        return dummy.next;
    }
}
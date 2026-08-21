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
        ListNode cur = head;
        int length=0;
        while(cur != null){
            cur = cur.next;
            length++;
        }
        if(length == n){
            return head.next;
        }
        cur = head;
        ListNode prev = null;
        int i=0;
        while(i != length-n){
            prev = cur;
            cur = cur.next;
            i++;
        }
        prev.next = cur.next;
        cur.next = null;
        return head;

    }
}
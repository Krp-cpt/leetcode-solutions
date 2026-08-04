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
        ListNode cur = head;
        if(head == null)
        {
            return null;
        }
        int count =0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        cur = head;
        k=k%count;
        for(int i=0;i<k;i++)
        {
            ListNode prev = null;
            while(cur.next != null){
                prev = cur;
                cur = cur.next;
            }
            cur.next = head;
            prev.next = null;
            head = cur;
        }
        return head;
    }
}
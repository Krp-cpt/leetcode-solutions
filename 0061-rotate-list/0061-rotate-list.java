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
        if(head == null)
        {
            return null;
        }
        ListNode temp = head;
        int count =0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        k=k%count;
        for(int i=0;i<k;i++)
        {
        ListNode cur = head;
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
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1=list1;
        ListNode curr2=list2;
        if(curr1 == null ){
            // merge = curr2;
            return curr2;
        }
        if(curr2==null)
        {
            // merge = curr1;
            return curr1;
        }
        if(curr1.val<=curr2.val){
              curr1.next = mergeTwoLists(curr1.next,curr2);
              return curr1;
            }
            curr2.next= mergeTwoLists(curr1,curr2.next);
            return curr2;
            
    }
}
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode cur = head;
        List<ListNode> node = new ArrayList<>();
        while(cur != null){
            if(!node.contains(cur)){
                node.add(cur);
            }
            else{
                return true;
            }
            cur = cur.next ;
        }
        return false;
    }
}
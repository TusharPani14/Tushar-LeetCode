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
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> s=new HashSet<>();
        if(head==null){
            return null;
        }
        while(head.next!=null){
            if(s.contains(head)){
                return head;
            }
            s.add(head);
            head=head.next;
        }
        return null;
    }
}
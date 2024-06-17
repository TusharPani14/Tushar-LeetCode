/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return recurReverse(head);
        // ListNode nextElem=null;
        // ListNode cur=head;
        // ListNode prev=null;
        // while(cur!=null){
        // nextElem=cur.next;
        // cur.next=prev;
        // prev=cur;
        // cur=nextElem;
        // }
        // return prev;
    }

    public ListNode recurReverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = recurReverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
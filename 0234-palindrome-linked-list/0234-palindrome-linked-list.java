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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        if(head.next==null){
            return true;
        }
        while (head != null) {
            if (!s.isEmpty() && s.peek() == head.val) {
                s.pop();
            } else
                s.push(head.val);
            head = head.next;
        }
        if (s.isEmpty()) {
            return true;
        }
        return false;
    }
}
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
        if(head.next==null && n==1){
            return null;
        }
        else if(head.next==null){
            return head;
        }
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        temp=head;
        if(c==n){
            head=head.next;
            return head;
        }
        int x=c-n;
        for(int i=1;i<x;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
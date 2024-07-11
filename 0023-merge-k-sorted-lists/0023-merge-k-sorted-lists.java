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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            while(lists[i]!=null){
                pq.add(lists[i].val);
                lists[i]=lists[i].next;
            }
        }
        if (pq.isEmpty()) {
            return null;
        }
        ListNode res=new ListNode(pq.poll());
        ListNode temp=res;
        while(!pq.isEmpty()){
            ListNode newNode=new ListNode(pq.poll());
            temp.next=newNode;
            temp=temp.next;
        }
        return res;
    }
}
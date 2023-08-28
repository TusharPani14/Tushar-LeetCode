/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        map<ListNode*,int> node;
        while(head!=NULL){
            if(!node[head])
                node[head]=1 ;
            else
                return head;
            head=head->next;
        }
        return NULL;
    }
};
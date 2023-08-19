/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int sum=0;
        ListNode res(0);
        ListNode *current=&res;
        while(l1 || l2 || sum!=0)
        {
            if(l1)
            {
            sum+=l1->val;
            l1=l1->next;
            }
            
            if(l2)
            {
            sum+=l2->val;
            l2=l2->next;
            }
            current->next=new ListNode(sum%10);
            current=current->next;
            sum=sum/10;
        }
        if(sum>0)
        current->next=new ListNode(sum/10);
        return res.next;
    }
};
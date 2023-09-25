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
    ListNode* mergeKLists(vector<ListNode*>& lists) {
    if(lists.size()==0)return NULL;
    priority_queue<int> pq;
    for (int i=0;i<lists.size();i++)
    {
        ListNode* temp=lists[i];
        while(temp!=NULL)
         {
            pq.push(temp->val*(-1));
            temp=temp->next;
        }
    }
    if(pq.size()==0) return NULL;
    ListNode* head=new ListNode;
    head->val=(pq.top() * (-1));
    head->next=NULL;
    pq.pop();
    
    ListNode* ans=head;
    while(!pq.empty())
    {
        ListNode* neksht=new ListNode;
        neksht->val=(pq.top() * (-1));
        neksht->next=NULL;
        ans->next=neksht;
        pq.pop();
        ans=ans->next;
        
    }
    return head;
        }
    };
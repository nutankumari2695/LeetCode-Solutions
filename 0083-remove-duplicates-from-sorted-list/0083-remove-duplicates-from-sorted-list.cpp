class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        ListNode* curr = head;
        
        while (curr != NULL && curr->next != NULL) {
            if (curr->val == curr->next->val) {
                // Skip the duplicate node
                curr->next = curr->next->next;
            } else {
                // Move to the next node if no duplicate
                curr = curr->next;
            }
        }
        
        return head;
    }
};

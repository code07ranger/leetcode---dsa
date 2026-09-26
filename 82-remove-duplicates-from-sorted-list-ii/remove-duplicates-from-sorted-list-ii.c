/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* deleteDuplicates(struct ListNode* head) {
    struct ListNode dummy;
    dummy.val = 0;
    dummy.next = head;
    struct ListNode* prev = &dummy;
    struct ListNode* curr = head;
    while (curr != NULL) {
        bool has_duplicate = false;
        while (curr->next != NULL && curr->val == curr->next->val) {
            has_duplicate = true;
            curr = curr->next;
        }
        
        if (has_duplicate) {
            prev->next = curr->next;
        } else {
            prev = prev->next;
        }
        curr = curr->next;
    }
    return dummy.next;
}
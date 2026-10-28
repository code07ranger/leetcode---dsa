/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* insertionSortList(struct ListNode* head) {
    if (!head || !head->next) {
        return head;
    }
    struct ListNode dummy;
    dummy.next = NULL;
    struct ListNode *curr = head;
    while (curr) {
        struct ListNode *nextNode = curr->next;
        struct ListNode *prev = &dummy;
        while (prev->next && prev->next->val < curr->val) {
            prev = prev->next;
        }
        curr->next = prev->next;
        prev->next = curr;
        curr = nextNode;
    }
    return dummy.next;
}
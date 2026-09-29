/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void deleteNode(struct ListNode* node) {
    node->val=node->next->val;
    struct ListNode* temp=node->next;
    node->next=node->next->next;
    free(temp);
}
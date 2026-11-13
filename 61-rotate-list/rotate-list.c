/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* rotateRight(struct ListNode* head, int k) {
    if (head == NULL || head->next == NULL || k == 0) {
        return head;
    }
    struct ListNode* tail = head;
    int len = 1;
    while (tail->next != NULL) {
        tail = tail->next;
        len++;
    }
    k = k % len;
    if (k == 0) {
        return head;
    }
    tail->next = head;
    struct ListNode* newTail = head;
    for (int i = 0; i < len - k - 1; i++) {
        newTail = newTail->next;
    }
    struct ListNode* newHead = newTail->next;
    newTail->next = NULL;

    return newHead;
}
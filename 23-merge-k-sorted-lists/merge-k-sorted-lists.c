/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeKLists(struct ListNode** lists, int listsSize) {
    if (listsSize == 0 || lists == NULL) return NULL; 
    struct ListNode dummy;
    dummy.next = NULL;
    struct ListNode* tail = &dummy;
    while (1) {
        int minIndex = -1;
        int minVal = 10001; 
        for (int i = 0; i < listsSize; i++) {
            if (lists[i] != NULL && lists[i]->val < minVal) {
                minVal = lists[i]->val;
                minIndex = i;
            }
        }
        if (minIndex == -1) {
            break;
        }
        tail->next = lists[minIndex];
        tail = tail->next;
        lists[minIndex] = lists[minIndex]->next;
    }
    return dummy.next;
}
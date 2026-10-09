
struct ListNode* mergeKLists(struct ListNode** lists, int listsSize) {
    struct ListNode dummy;
    struct ListNode* tail = &dummy;
    dummy.next = NULL;
    
    while (1) {
        int min_idx = -1;
        for (int i = 0; i < listsSize; i++) {
            if (lists[i] != NULL) {
                if (min_idx == -1 || lists[i]->val < lists[min_idx]->val) {
                    min_idx = i;
                }
            }
        }
        if (min_idx == -1) break; 
        
        tail->next = lists[min_idx];
        tail = tail->next;
        lists[min_idx] = lists[min_idx]->next;
    }
    return dummy.next;
}
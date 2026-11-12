struct ListNode *detectCycle(struct ListNode *head) {
    struct ListNode *slow=head;
    struct ListNode *fast=head;
    while (fast!=NULL && fast->next!=NULL) {
        slow=slow->next;
        fast=fast->next->next;
        if (slow==fast) {
            struct ListNode *entry =head;
            while (entry != slow) {
                entry = entry->next;
                slow = slow->next;
            }
            return entry;
        }
    }
    return NULL;
}
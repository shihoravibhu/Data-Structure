// 237. Delete Node in a Linked List
// Understanding why this trick is used (lack of head, next node always exists).

 struct ListNode {
     int val;
     struct ListNode *next;
 };
 
void deleteNode(struct ListNode* node) {

    node->val = node->next->val;
    struct ListNode* temp = node->next;
    node->next = node->next->next;
    free(temp); 
        
}

void main(){

}
// 23. Merge k Sorted Lists

 class ListNode {
  int val;
   ListNode next;
   ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 

public class l11_mergeKLists {
     public ListNode mergeTwoLists(ListNode head1, ListNode head2) {

        if(head1 == null || head2 == null){

            return (head1 == null)? head2 : head1 ;
        }

        if(head1.val <= head2.val){

            head1.next = mergeTwoLists(head1.next,head2);

            return head1;
        }

        else{

            head2.next = mergeTwoLists(head1,head2.next);

            return head2;

        }
        
    }
    public ListNode mergeKLists(ListNode[] lists) {

    if (lists.length == 0) {
            return null;
        }

        int s = 0, e = lists.length - 1;
        
        while (e > 0) {
            lists[s] = mergeTwoLists(lists[s], lists[e]);
            s++;
            e--;
            if (s >= e) {
                s = 0;
            }
        }
        return lists[0];


    }
    public static void main(String[] args) {
        
    }
}

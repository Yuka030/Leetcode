import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle_141 {
    /**
     * Definition for singly-linked list.
     **/
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
             val = x;
              next = null;
          }
      }
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }

        Set<ListNode> set = new HashSet<>();
        while(head.next != null){
            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;
        }

        return false;
    }
}

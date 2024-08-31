TC = O(n) sc = O(1)
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy  = new ListNode();
        dummy.next = head;
        ListNode node = dummy;

        while(node != null){
            ListNode f = node.next;
            ListNode s = null;
            if(f != null){
                s = f.next;
            }
            if(s != null){
            ListNode temp = s.next;
            s.next = f;
            node.next = s;
            f.next = temp;
            node = f;
            }
            else{
                break;
            }
        }
        return dummy.next;
    }
}

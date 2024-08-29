TC= O(n)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int rem = count-n;
        if(rem == 0){
            return head.next;
        }
        temp=head;
        for(int i=1;i<rem;i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;

        return head;
        
    }
}

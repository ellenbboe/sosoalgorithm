package nowcoder;

public class solution18_2 {
    public ListNode deleteDuplication(ListNode head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode next = head.next;
        if(head.val == next.val)
        {
            while(next!=null&&head.val==next.val)
            {
                next = next.next;
            }
            return deleteDuplication(next);

        }else{
            head.next = deleteDuplication(head.next);
            return head;
        }
    }
}

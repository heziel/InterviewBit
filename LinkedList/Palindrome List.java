/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {
        
        ListNode H = A;
        ListNode Prev = new ListNode( H.val );
        
        while ( H.next != null )
        {
            ListNode Curr = new ListNode( H.next.val );
            Curr.next = Prev;
            Prev = Curr;
            H = H.next;
        }
        
        ListNode first = A;
        ListNode second = Prev;
        
        while ( first.next != null )
        {
            if ( first.val != second.val )
                return 0;
            first = first.next;
            second = second.next;
        }
        return 1;
        
    }
}
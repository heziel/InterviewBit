/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode a, ListNode b) {
	   
	  ListNode prev = new ListNode(0);
	  ListNode head = prev;
	  ListNode first = a;
	  ListNode second = b;
	  
	  while ( first != null || second != null)
	  {
	      
	        if ( first == null ){
	           prev.next = second;
	           return head.next;
	        }
	        if ( second == null ){
	           prev.next = first;
	           return head.next;
	        }
	        
	      
	        if ( first.val <= second.val ){
	            prev.next = first;
	            first = first.next;
	        }
	        else{
	            prev.next = second;      
	            second = second.next;
	        }
	        
	        prev = prev.next;
	  }
	  
	  return head.next;
	  
	}
}

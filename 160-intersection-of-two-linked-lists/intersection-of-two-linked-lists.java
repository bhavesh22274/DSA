/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //approach 3{imps}
        ListNode curra=headA;
        ListNode currb=headB;
        while(curra!=currb){
            if(curra==null){
                curra=headB;
            }else{
                curra=curra.next;
            }
            if(currb==null){
                currb=headA;
            }else{
                currb=currb.next;
            }
        }
        return curra;
    }
}
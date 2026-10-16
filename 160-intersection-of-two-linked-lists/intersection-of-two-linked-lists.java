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
        //approach-1
        ListNode curra=headA;
        ListNode currb=headB;
        while(curra!=null){
            currb=headB;
            while(currb!=null){
                if(curra==currb){
                    return curra;
                }
                currb=currb.next;
            }
            curra=curra.next;
        }
        return null;
    }
}
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
        //approach-2
        ListNode curra=headA;
        ListNode currb=headB;
        HashSet<ListNode> set=new HashSet<>();
        while(currb!=null){
            set.add(currb);
            currb=currb.next;
        }
        while(curra!=null){
            if(set.contains(curra)){
                return curra;
            }
            curra=curra.next;
        }
        return null;
    }
}
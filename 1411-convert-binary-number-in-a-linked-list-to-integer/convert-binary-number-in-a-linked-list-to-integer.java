/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    //approch 1
    // public ListNode reverse(ListNode head) {
    //     ListNode curr = head;
    //     ListNode prev = null;
    //     ListNode next;
    //     while (curr != null) {
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     return prev;
    // }

    public int getDecimalValue(ListNode head) {
        // head = reverse(head);

        // int result = 0;
        // int power = 0;

        // while (head != null) {
        //     if (head.val == 1) {
        //         result += Math.pow(2, power);
        //     }
        //     power++;
        //     head = head.next;
        // }
        // return result;


        int result = 0;

        while(head != null){
            result = (result << 1) | (head.val);

            head = head.next;
        }
        return result;
    }
}